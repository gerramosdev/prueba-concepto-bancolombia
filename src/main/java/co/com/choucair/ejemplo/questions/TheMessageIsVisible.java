package co.com.choucair.ejemplo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheMessageIsVisible implements Question<Boolean> {

    private final Target errorMessageLabel;
    private final String message;

    @Override
    public Boolean answeredBy(Actor actor) {
        return errorMessageLabel.resolveFor(actor).getText().equals(message);
    }

    public TheMessageIsVisible(Target errorMessageLabel, String message) {
        this.errorMessageLabel = errorMessageLabel;
        this.message = message;
    }

    public static TheMessageIsVisible inThePage(Target errorMessageLabel, String message) {
        return new TheMessageIsVisible(errorMessageLabel, message);
    }
}
