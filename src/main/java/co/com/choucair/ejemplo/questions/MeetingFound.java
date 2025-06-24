package co.com.choucair.ejemplo.questions;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class MeetingFound implements Question<Boolean> {

    private SerenityData serenityData;

    public MeetingFound(SerenityData serenityData) {
        this.serenityData = serenityData;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target LBL_MEETING = MeetingPage.ITEM_MEETING.of(serenityData.getMeeting_name());
        return LBL_MEETING.isVisibleFor(actor);
    }
    public static MeetingFound meetingVisible(SerenityData serenityData){
        return new MeetingFound(serenityData);
    }
}
