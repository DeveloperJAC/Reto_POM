package co.com.sofka.page.opensource.moduadmin;

import co.com.sofka.page.common.CommonActionOnPages;
import io.cucumber.messages.internal.com.google.protobuf.Option;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OpenSourceAdmin extends CommonActionOnPages {

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    By modulation = By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");

//Assert
    By systemUser =  By.xpath("//*[@id=\"systemUser-information\"]/a");

    By sysUsername = By.id("searchSystemUser_userName");
    By selectRoll = By.xpath("//option[2]");
    By employeeName = By.id("searchSystemUser_employeeName_empName");
    By status = By.xpath("//option[1]");
    By submitBtn = By.xpath("//*[@id=\"searchBtn\"]");



    public OpenSourceAdmin(WebDriver driver) {
        super(driver);
    }

    public void openLogin(){
        isDisplayed(username);
        type("Admin", username);
        type("admin123", password);
        submit(submit);
        click(modulation);
        type("David.Morris", sysUsername);
        click(selectRoll);
        type("David Morris", employeeName);
        clickOn(status);
        submit(submitBtn);

    }

    public boolean isHomepage(){
        return isDisplayed(systemUser);
    }

}
