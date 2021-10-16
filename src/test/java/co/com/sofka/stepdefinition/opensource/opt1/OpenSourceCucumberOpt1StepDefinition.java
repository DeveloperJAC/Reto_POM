package co.com.sofka.stepdefinition.opensource.opt1;

import co.com.sofka.page.opensource.login.OpenSourceLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OpenSourceCucumberOpt1StepDefinition  {

    private WebDriver driver;
    OpenSourceLogin openSourceLogin;

    @Given("que el empleado administrativo encuentre en la página web el formulario de ingreso")
    public void queElEmpleadoAdministrativoEncuentreEnLaPaginaWebElFormularioDeIngreso() {
        try {
            openSourceLogin = new OpenSourceLogin(driver);
            driver = openSourceLogin.chromeDriverConnection();
            openSourceLogin.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }catch (Exception exception){
            driver.quit();
        }

    }

    @When("el empleado administrativo ingresa el usuario y password, da click en ingresar")
    public void elEmpleadoAdministrativoIngresaElUsuarioYPasswordDaClickEnIngresar() {
        try {
            openSourceLogin.openLogin();

        }catch (Exception exception){
            driver.quit();
        }

    }

    @Then("el sistema deberá iniciar sesion y dirigirlo al Home de la pagina web")
    public void elSistemaDeberaIniciarSesionYDirigirloAlHomeDeLaPaginaWeb() {
        try {
            Assertions.assertTrue(openSourceLogin.isHomepage());
        }catch (Exception exception){
            driver.quit();
        }
        finally {
            driver.quit();
        }
        }

    }

