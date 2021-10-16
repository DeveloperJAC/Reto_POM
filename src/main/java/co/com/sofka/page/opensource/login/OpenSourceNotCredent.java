package co.com.sofka.page.opensource.login;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenSourceNotCredent extends CommonActionOnPages {
    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    By notCredentialAssertion =  By.xpath("//*[@id=\"spanMessage\"]");

    public OpenSourceNotCredent(WebDriver driver) {
        super(driver);
    }

    public void openLogin(){
        isDisplayed(username);
        type("", username);
        type("", password);
        submit(submit);
    }
    public boolean notCredentials(){
        return isDisplayed(notCredentialAssertion);
    }
}
