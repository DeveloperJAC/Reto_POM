package co.com.sofka.runner.opensource.login;


import co.com.sofka.page.opensource.login.OpenSourceLogin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;



public class OpenSourceTest {


    private WebDriver driver;
    OpenSourceLogin openSourceLogin;


    @Before
    public void setUp()  {
        try {
        openSourceLogin = new OpenSourceLogin(driver);
        driver = openSourceLogin.chromeDriverConnection();
        openSourceLogin.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }catch (Exception exception){
            driver.quit();
        }
    }




    @Test
    public void test() throws InterruptedException {
        try {
            openSourceLogin.openLogin();
            Thread.sleep(2000);
            Assertions.assertTrue(openSourceLogin.isHomepage());
        }catch (Exception exception){
            driver.quit();
        }
    }

    @After
    public void tearDown()  {
        driver.quit();
    }

}




