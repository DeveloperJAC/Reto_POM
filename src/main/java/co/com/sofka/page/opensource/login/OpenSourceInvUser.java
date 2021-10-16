package co.com.sofka.page.opensource.login;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenSourceInvUser extends CommonActionOnPages {
    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    By userInvalidAssertion =  By.id("spanMessage");

    public OpenSourceInvUser(WebDriver driver) {
        super(driver);
    }

    public void openLogin(){
        isDisplayed(username);
        type("Admin33", username);
        type("admin123", password);
        submit(submit);
    }
    public boolean invalidCredentials(){
        return isDisplayed(userInvalidAssertion);
    }
}


