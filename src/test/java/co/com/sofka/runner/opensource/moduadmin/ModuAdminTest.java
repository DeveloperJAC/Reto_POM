package co.com.sofka.runner.opensource.moduadmin;


import co.com.sofka.page.opensource.login.OpenSourceLogin;
import co.com.sofka.page.opensource.moduadmin.OpenSourceAdmin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


public class ModuAdminTest {


    private WebDriver driver;
    OpenSourceAdmin openSourceAdmin;


    @Before
    public void setUp()  {
        try {
        openSourceAdmin = new OpenSourceAdmin(driver);
        driver = openSourceAdmin.chromeDriverConnection();
        openSourceAdmin.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }catch (Exception exception){
            driver.quit();
        }
    }


    @Test
    public void test()  {
        try {
            openSourceAdmin.openLogin();
            Thread.sleep(5000);
            Assertions.assertTrue(openSourceAdmin.isHomepage());
        }catch (Exception exception){
            driver.quit();
        }
    }

    @After
    public void tearDown()  {
        driver.quit();
    }

}




