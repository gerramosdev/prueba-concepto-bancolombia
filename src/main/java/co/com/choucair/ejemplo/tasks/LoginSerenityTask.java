package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.SerenityData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.ejemplo.userinterfaces.LoginPage.*;

public class LoginSerenityTask implements Task {
    private SerenityData credentials;

    public LoginSerenityTask(SerenityData credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(USERNAME_INPUT),
                Enter.theValue(credentials.getUsername()).into(USERNAME_INPUT),
                Clear.field(PASSWORD_INPUT),
                Enter.theValue(credentials.getPassword()).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static LoginSerenityTask credentialsLogin(SerenityData credentials){
        return Tasks.instrumented(LoginSerenityTask.class,credentials);


    }

}
