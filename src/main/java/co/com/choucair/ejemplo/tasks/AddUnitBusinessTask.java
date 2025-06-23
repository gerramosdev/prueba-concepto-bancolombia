package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.BusinessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddUnitBusinessTask implements Task {
    private SerenityData businessData;

    public AddUnitBusinessTask(SerenityData businessData) {
        this.businessData = businessData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BusinessPage.ADD_BUSINESS_BTN),
                Enter.theValue(businessData.getUnit_business_name()).into(BusinessPage.INPUT_NAME_BUSINESS),
                Click.on(BusinessPage.SELECT_PARENT_UNIT),
                Click.on(BusinessPage.OPTION_PARENT_UNIT),
                Click.on(BusinessPage.SAVE_BUSINESS_BTN)
        );
    }
    public static AddUnitBusinessTask elementsBusinessForm() {
        return Tasks.instrumented(AddUnitBusinessTask.class);
    }
}
