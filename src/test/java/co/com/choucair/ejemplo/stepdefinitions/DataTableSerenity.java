package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.models.SerenityData;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableSerenity {

    @DataTableType
    public SerenityData table(Map<String, String> entry) {
        return new SerenityData(
                entry.get("username"),
                entry.get("password"),
                entry.get("unit_business_name")
        );
    }
}
