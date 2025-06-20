package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/")
public class LoginPage extends PageObject {

    public static final Target USERNAME_INPUT = Target.the("Username input")
            .located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD_INPUT = Target.the("Password input")
            .located(By.id("LoginPanel0_Password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//*[@id='LoginPanel0_LoginButton' and @type='submit']");
}
