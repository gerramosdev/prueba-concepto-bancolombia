package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target BODY_DASHBOARD = Target.the("Dashboard").locatedBy("//*[@class='s-sidebar-section-title']");
    public static final Target MEETING_ITEM = Target.the("item reuniones").locatedBy("//*[contains(text(),'Meeting')]");
    public static final Target BUSINESS_ITEM = Target.the("item unidades de negocio").locatedBy("//*[contains(text(),'Business Units')]");
}
