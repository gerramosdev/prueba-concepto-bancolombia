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

  @Reunion
  Scenario Outline: creation a new business unit using save and close
    When i try to login with correct credentials
      | username   | password   |
      | <username> | <password> |
    And I enter the meeting section and enter business unit page
    And I fill out all the fields of the new business unit registration form
      | unit_business_name   |
      | <unit_business_name> |
    And I search business unit
      | unit_business_name   | parent_unit   |
      | <unit_business_name> | <parent_unit> |
    Then I confirm that the new business unit has been created

    Examples:
      | username | password | unit_business_name |
      | admin    | serenity | Assurance          |
