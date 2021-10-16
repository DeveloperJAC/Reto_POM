package co.com.sofka.page.opensource.login;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenSourceInvPass extends CommonActionOnPages {

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    By passInvalidAssertion =  By.id("spanMessage");

    public OpenSourceInvPass(WebDriver driver) {
        super(driver);
    }

    public void openLogin(){
        isDisplayed(username);
        type("Admin", username);
        type("1234567", password);
        submit(submit);
    }
    public boolean invalidCredentials(){
        return isDisplayed(passInvalidAssertion);
    }
}
