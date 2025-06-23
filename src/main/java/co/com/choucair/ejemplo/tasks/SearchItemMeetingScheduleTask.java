package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SearchItemMeetingScheduleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.MEETING_ITEM),
                Click.on(DashboardPage.SCHEDULES_ITEM)

        );
    }
}
