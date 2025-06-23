package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.questions.ElementVisible;
import co.com.choucair.ejemplo.questions.UnitBusinessFound;
import co.com.choucair.ejemplo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class SerenityDemoStepDefinition {
    @Before
    public void InitializateScenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("i enter to Serenity Demo")
    public void iEnterToSerenityDemo() {
        OnStage.theActorCalled("Admin").wasAbleTo(OpenPageTask.openSerenityDemo());
    }

    @When("i try to login with correct credentials")
    public void iTryToLoginWithCorrectCredentials(SerenityData data) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginSerenityTask.credentialsLogin(data)
        );
    }

    @Then("i see the main the dashboard")
    public void iSeeTheMainTheDashboard() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        ElementVisible.isVisibleDashboard(), Matchers.is(true)
                )
        );
    }


    @And("I enter the meeting section and enter business unit page")
    public void iEnterTheMeetingSectionAndEnterBusinessUnitPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchItemMeetingTask.elementsBusiness()
        );
    }

    @And("I fill out all the fields of the new business unit registration form")
    public void iFillOutAllTheFieldsOfTheNewBusinessUnitRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddUnitBusinessTask.elementsBusinessForm()
        );
    }

    @And("I search business unit")
    public void iSearchBusinessUnit(SerenityData data) {
      OnStage.theActorInTheSpotlight().attemptsTo(
              SearchUnitBusinessTask.searchItemUnitBusiness(data)
      );
    }

    @Then("I confirm that the new business unit has been created")
    public void iConfirmThatTheNewBusinessUnitHasBeenCreated(SerenityData data) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        UnitBusinessFound.unitVisible(data), Matchers.is(true)
                )
        );
    }
}
