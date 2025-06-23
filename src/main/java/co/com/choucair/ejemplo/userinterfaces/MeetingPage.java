package co.com.choucair.ejemplo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {
    public static final Target MEETING_ADD_BTN = Target.the("Boton nueva meeting").locatedBy("//*[@data-action='add']");
    public static final Target INPUT_NAME_MEETING = Target.the("Nombre de la meeting").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingName");
    public static final Target SELECT_TYPE_MEETING = Target.the("Seleccionar tipo").locatedBy("#s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId");
    public static final Target ITEM_TYPE_SELECT = Target.the("opción de tipo").locatedBy("//*[@id='select2-result-label-27']");
    public static final Target CLEAR_SELECT_TYPE = Target.the("Botón limpiar tipo").locatedBy("//*[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId']/a/abbr");
    public static final Target INPUT_NUMBER_MEETING = Target.the("Número de la meeting").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber");
    public static final Target START_DATE_INPUT =  Target.the("Fecha inicio").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_StartDate");
    public static final Target END_DATE_INPUT = Target.the("Fecha fin").locatedBy("#Serenity_Pro_Meeting_MeetingDialog10_EndDate");
    public static final Target SAVE_MEETING_BTN = Target.the("Botón guardar meeting").locatedBy("//*[@data-action='save-and-close']");

}
