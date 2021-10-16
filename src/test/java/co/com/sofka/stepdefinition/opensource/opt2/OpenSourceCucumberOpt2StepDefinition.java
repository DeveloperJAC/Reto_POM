package co.com.sofka.stepdefinition.opensource.opt2;

import co.com.sofka.page.opensource.login.OpenSourceLogin;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OpenSourceCucumberOpt2StepDefinition implements En {

    private WebDriver driver;
    OpenSourceLogin openSourceLogin;

    public OpenSourceCucumberOpt2StepDefinition() {
        Given("que el empleado administrativo encuentre en la página web el formulario de ingreso", () -> {
            try {
                openSourceLogin = new OpenSourceLogin(driver);
                driver = openSourceLogin.chromeDriverConnection();
                openSourceLogin.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
            }catch (Exception exception){
                driver.quit();
            }

        });

        When("el empleado administrativo ingresa el usuario y password, da click en ingresar", () -> {
            try {
                openSourceLogin.openLogin();

            }catch (Exception exception){
                driver.quit();
            }

        });

        Then("el sistema deberá iniciar sesion y dirigirlo al Home de la pagina web", () -> {
            try {
                Assertions.assertTrue(openSourceLogin.isHomepage());
            }catch (Exception exception){
                driver.quit();
            }
            finally {
                driver.quit();
            }


        });


    }

    }

