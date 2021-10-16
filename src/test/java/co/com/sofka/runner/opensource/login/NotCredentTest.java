package co.com.sofka.runner.opensource.login;

import co.com.sofka.page.opensource.login.OpenSourceNotCredent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class NotCredentTest {
    private WebDriver driver;
    OpenSourceNotCredent openSourceNotCredent;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados.";


    @Before
    public void setUp() throws Exception {
        openSourceNotCredent = new OpenSourceNotCredent(driver);
        driver = openSourceNotCredent.chromeDriverConnection();
        openSourceNotCredent.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }


    @Test
    public void test() throws InterruptedException {
        openSourceNotCredent.openLogin();
        Thread.sleep(2000);
        Assertions.assertTrue(openSourceNotCredent.notCredentials(), ASSERTION_EXCEPTION_MESSAGE);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
