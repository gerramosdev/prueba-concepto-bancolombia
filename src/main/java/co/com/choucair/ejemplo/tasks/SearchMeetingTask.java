package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchMeetingTask implements Task {
    private SerenityData meetingData;

    public SearchMeetingTask(SerenityData meetingData){
        this.meetingData = meetingData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingData.getMeeting_name()).into(MeetingPage.SEARCH_MEETING_INPUT)
        );
    }

    public static SearchMeetingTask searchMeeting(SerenityData meetingData){
       return Tasks.instrumented(SearchMeetingTask.class,meetingData);
    }
}
