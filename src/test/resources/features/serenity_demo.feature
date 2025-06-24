@Regression
Feature: Login to Serenity Demo,
  As an admin user's, I wish create a new unit work to schedule to meeting

  Background:
    Given i enter to Serenity Demo

  @Login
  Scenario Outline: successful login
    When i try to login with correct credentials
      | username   | password   |
      | <username> | <password> |
    Then i see the main the dashboard
    Examples:
      | username | password |
      | admin    | serenity |

  @Negocio
  Scenario Outline: creation a new business unit using save and close
    When i try to login with correct credentials
      | username   | password   |
      | <username> | <password> |
    And I enter the meeting section and enter business unit page
    And I fill out all the fields of the new business unit registration form
      | unit_business_name   |
      | <unit_business_name> |
    And I search business unit
      | unit_business_name   |
      | <unit_business_name> |
    Then I confirm that the new business unit has been created
      | unit_business_name   |
      | <unit_business_name> |

    Examples:
      | username | password | unit_business_name |
      | admin    | serenity | Assurance          |

  @Reunion

  Scenario Outline: Scheduling a meeting
    When i try to login with correct credentials
      | username   | password   |
      | <username> | <password> |
    And I enter the meeting section and enter meeting page and enter meeting scheduling page
    And I fill out the meeting form by selecting the created business unit
      | meeting_name   | meeting_type   | meeting_number   | start_date   | end_date   | location   | unit_business_name   | organized_by   | reporter   | attendee_list   |
      | <meeting_name> | <meeting_type> | <meeting_number> | <start_date> | <end_date> | <location> | <unit_business_name> | <organized_by> | <reporter> | <attendee_list> |
    And I search the meeting in the table
      | meeting_name   |
      | <meeting_name> |
    Then I confirm that the meeting has been created
      | meeting_name   |
      | <meeting_name> |

    Examples:
      | username | password | meeting_name        | meeting_type | meeting_number | start_date       | end_date         | location | unit_business_name  | organized_by | reporter        | attendee_list |
      | admin    | serenity | Reunion Bancolombia | Strategy     | GD-001         | 30/06/2025 14:00 | 30/06/2025 16:00 | HQ-02    | Assurance | Adam Stewart | Victoria Wright | Aaron Taylor  |

