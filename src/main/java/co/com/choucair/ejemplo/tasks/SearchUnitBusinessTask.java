package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.BusinessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchUnitBusinessTask implements Task {
    private SerenityData businessData;

    public SearchUnitBusinessTask(SerenityData businessData) {
        this.businessData = businessData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(businessData.getUnit_business()).into(BusinessPage.INPUT_SEARCH_BUSINESS)
        );
    }

    public static SearchUnitBusinessTask searchItemUnitBusiness(){
        return Tasks.instrumented(SearchUnitBusinessTask.class);
    }
}
