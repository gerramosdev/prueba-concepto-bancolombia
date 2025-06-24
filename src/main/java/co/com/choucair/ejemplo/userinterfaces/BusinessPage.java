package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessPage {

    public static final Target ADD_BUSINESS_BTN = Target.the("Boton agregar nueva unidad de negocio").locatedBy("//*[@data-action='add']");
    public static final Target INPUT_NAME_BUSINESS =  Target.the("Input nombre unidad de negocio").locatedBy("//input[@id='Serenity_Pro_Meeting_BusinessUnitDialog3_Name']");
    public static final Target SELECT_PARENT_UNIT =  Target.the("Select Unidad padre").locatedBy("#s2id_Serenity_Pro_Meeting_BusinessUnitDialog3_ParentUnitId.select2-container");
    public static final Target OPTION_PARENT_UNIT =  Target.the("Opción Unidad padre").locatedBy("(//div[contains(@class,'select2-result-label')])[2]");
    public static final Target SAVE_BUSINESS_BTN = Target.the("Botón guardar").locatedBy("//*[@data-action='save-and-close' and contains(@class, 'save-and-close-button')]");
    public static  final Target INPUT_SEARCH_BUSINESS = Target.the("Input de búsqueda de unidad de negocio").locatedBy("//input[@id='Serenity_Pro_Meeting_BusinessUnitGrid0_QuickSearchInput']");
    public static  final Target LBL_UNI_BUSINESS = Target.the("Input de búsqueda de unidad de negocio").locatedBy("(//*[@data-item-type='Pro.Meeting.BusinessUnit' and contains(text(),'{0}')])[1]");



}
