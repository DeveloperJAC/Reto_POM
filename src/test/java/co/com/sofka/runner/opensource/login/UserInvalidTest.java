package co.com.sofka.runner.opensource.login;

import co.com.sofka.page.opensource.login.OpenSourceInvUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class UserInvalidTest {

    private WebDriver driver;
    OpenSourceInvUser openSourceInvUser;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados.";


    @Before
    public void setUp()  {
        try {
        openSourceInvUser = new OpenSourceInvUser(driver);
        driver = openSourceInvUser.chromeDriverConnection();
        openSourceInvUser.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }catch (Exception exception){
            driver.quit();
        }
    }


    @Test
    public void test()  {
        try {
        openSourceInvUser.openLogin();
        Thread.sleep(2000);
        Assertions.assertTrue(openSourceInvUser.invalidCredentials(), ASSERTION_EXCEPTION_MESSAGE);
        }catch (Exception exception){
            driver.quit();
        }

    }

    @After
    public void tearDown()  {
        driver.quit();
    }

}


