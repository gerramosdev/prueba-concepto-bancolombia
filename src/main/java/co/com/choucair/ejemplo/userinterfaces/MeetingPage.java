package co.com.choucair.ejemplo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {
    // general locators
    public static final Target MEETING_ADD_BTN = Target.the("Boton nueva meeting").locatedBy("//*[@data-action='add']");
    public static final Target SEARCH_MEETING_INPUT = Target.the("Input buscar reunión").locatedBy("#Serenity_Pro_Meeting_MeetingGrid0_QuickSearchInput");
    public static final Target ITEM_MEETING =  Target.the("resultado búsqueda").locatedBy("(//*[@data-item-type='Pro.Meeting.Meeting' and  normalize-space(text())='{0}'])");
    public static final Target INPUT_NAME_MEETING = Target.the("Nombre de la meeting").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static final Target INPUT_NUMBER_MEETING = Target.the("Número de la meeting").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    // locators to type
    public static final Target CLEAR_SELECT_TYPE = Target.the("Botón limpiar tipo").locatedBy("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']/a/abbr");
    public static final Target SELECT_TYPE_MEETING = Target.the("Seleccionar tipo").locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId");
    public static final Target ITEM_TYPE_SELECT = Target.the("opción de tipo").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
    public static final Target INPUT_SEARCH_TYPE = Target.the("input de búsqueda de tipo").locatedBy("#s2id_autogen6_search");
    // locators to date
    public static final Target START_DATE_INPUT =  Target.the("Fecha inicio").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static final Target END_DATE_INPUT = Target.the("Fecha fin").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    // locators to location
    public static final Target LOCATION_SELECT = Target.the("Seleccionar ubicación").locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog34_LocationId");
    public static final Target LOCATION_OPTION = Target.the("Ubicación").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
    // locators to unit business
    public static final Target UNIT_BUSINESS_SELECT = Target.the("Seleccionar unidad de negocio").locatedBy("s2id_Serenity_Pro_Meeting_MeetingDialog34_UnitId");
    public static final Target UNIT_BUSINESS_SEARCH = Target.the("Buscar unidad de negocio").locatedBy("#s2id_autogen21_search");
    public static final Target UNIT_BUSINESS_OPTION =  Target.the("Opción unidad de negocio").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
    // locators to organization
    public static final Target ORGANIZATION_SELECT = Target.the("Seleccionar organizador").locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId");
    public static final Target ORGANIZATION_OPTION = Target.the("organizador").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
   // locators to reporter
    public static final Target REPORTER_SELECT = Target.the("Seleccionar reportero").locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId");
    public static final Target REPORTER_OPTION =  Target.the("Reportero").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
    //locators to attendee
    public static final Target ATTENDEE_SELECT =  Target.the("Seleccionar asistente").locatedBy("s2id_autogen11");
    public static final Target ATTENDEE_OPTION =  Target.the("Asistente").locatedBy("//div[contains(@class,'select2-result-label') and normalize-space(text())='{0}']");
    // Save button
    public static final Target SAVE_MEETING_BTN = Target.the("Botón guardar meeting").locatedBy("//*[@data-action='save-and-close']");

}
