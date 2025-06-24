package co.com.choucair.ejemplo.tasks;


import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ScheduleMeetingTask implements Task {
    private SerenityData meetingData;

    public ScheduleMeetingTask(SerenityData meetingData){
        this.meetingData = meetingData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.MEETING_ADD_BTN),
                Enter.theValue(meetingData.getMeeting_name()).into(MeetingPage.INPUT_NAME_MEETING),
                Click.on(MeetingPage.CLEAR_SELECT_TYPE),
                Click.on(MeetingPage.SELECT_TYPE_MEETING),
                Enter.theValue(meetingData.getMeeting_type()).into(MeetingPage.INPUT_SEARCH_TYPE),
                Click.on(MeetingPage.ITEM_TYPE_SELECT.of(meetingData.getMeeting_type())),
                Enter.theValue(meetingData.getMeeting_number()).into(MeetingPage.INPUT_NUMBER_MEETING),
                Enter.theValue(meetingData.getStart_date()).into(MeetingPage.START_DATE_INPUT),
                Enter.theValue(meetingData.getEnd_date()).into(MeetingPage.END_DATE_INPUT),
                Click.on(MeetingPage.UNIT_BUSINESS_SELECT),
                Click.on(MeetingPage.UNIT_BUSINESS_OPTION.of(meetingData.getUnit_business_name())),
                Click.on(MeetingPage.LOCATION_SELECT),
                Click.on(MeetingPage.LOCATION_OPTION.of(meetingData.getLocation())),
                Click.on(MeetingPage.ORGANIZATION_SELECT),
                Click.on(MeetingPage.ORGANIZATION_OPTION.of(meetingData.getOrganized_by())),
                Click.on(MeetingPage.REPORTER_SELECT.of(meetingData.getReporter())),
                Click.on(MeetingPage.REPORTER_OPTION.of(meetingData.getReporter())),
                Click.on(MeetingPage.ATTENDEE_SELECT),
                Click.on(MeetingPage.ATTENDEE_OPTION.of(meetingData.getAttendee_list())),
                Click.on(MeetingPage.SAVE_MEETING_BTN)

        );
    }
    public static ScheduleMeetingTask itemScheduleForm(SerenityData meetingData) {
        return Tasks.instrumented(ScheduleMeetingTask.class,meetingData);
    }
}
