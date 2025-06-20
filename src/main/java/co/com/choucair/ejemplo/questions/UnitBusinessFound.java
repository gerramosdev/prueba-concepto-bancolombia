package co.com.choucair.ejemplo.questions;

import co.com.choucair.ejemplo.models.SerenityData;
import co.com.choucair.ejemplo.userinterfaces.BusinessPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class UnitBusinessFound implements Question<Boolean> {
    private SerenityData serenityData;

    public UnitBusinessFound(SerenityData serenityData) {
        this.serenityData = serenityData;
    }

    public static UnitBusinessFound unitVisible(SerenityData serenityData) {
        return new UnitBusinessFound(serenityData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Target LBL_BUSINESS = BusinessPage.LBL_UNI_BUSINESS.of(serenityData.getUnit_business());
        return LBL_BUSINESS.isVisibleFor(actor);
    }
}
