package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;


public class OpenPageTask implements Task {
    private LoginPage page;

    public static OpenPageTask openSerenityDemo() {
        return Tasks.instrumented(OpenPageTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page),
                Browser.maximize()
        );
    }
}
