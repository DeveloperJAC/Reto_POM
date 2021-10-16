package co.com.sofka.page.opensource.login;

import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenSourceLogin extends CommonActionOnPages {

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    By loginAssertion =  By.id("welcome");

    public OpenSourceLogin(WebDriver driver) {
        super(driver);
    }

    public void openLogin(){
        isDisplayed(username);
        type("Admin", username);
        type("admin123", password);
        submit(submit);
    }

    public boolean isHomepage(){
        return isDisplayed(loginAssertion);
    }

}
