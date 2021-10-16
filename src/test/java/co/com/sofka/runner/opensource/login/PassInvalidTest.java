package co.com.sofka.runner.opensource.login;

import co.com.sofka.page.opensource.login.OpenSourceInvPass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PassInvalidTest {


    private WebDriver driver;
    OpenSourceInvPass openSourceInvPass;


    @Before
    public void setUp() throws Exception {
        openSourceInvPass = new OpenSourceInvPass(driver);
        driver = openSourceInvPass.chromeDriverConnection();
        openSourceInvPass.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }


    @Test
    public void test() throws InterruptedException {
        openSourceInvPass.openLogin();
        Thread.sleep(2000);
        Assertions.assertTrue(openSourceInvPass.invalidCredentials());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}


