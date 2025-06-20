package co.com.choucair.ejemplo.questions;

import co.com.choucair.ejemplo.userinterfaces.DashboardPage;
import co.com.choucair.ejemplo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ElementVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DashboardPage.BODY_DASHBOARD.isVisibleFor(actor);
    }

    public static ElementVisible isVisibleDashboard() {
        return new ElementVisible();
    }
}
