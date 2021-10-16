package co.com.sofka.stepdefinition.opensource.opt1;

import co.com.sofka.page.opensource.login.OpenSourceLogin;
import co.com.sofka.page.opensource.moduadmin.OpenSourceAdmin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ModulAdminCucumberOpt1StepDefinition {

    private WebDriver driver;
    OpenSourceAdmin openSourceAdmin;


    @Given("que el empleado administrativo pueda encontrar el buscador")
    public void queElEmpleadoAdministrativoPuedaEncontrarElBuscador() {
        try {
            openSourceAdmin = new OpenSourceAdmin(driver);
            driver = openSourceAdmin.chromeDriverConnection();
            openSourceAdmin.visit("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        }catch (Exception exception){
            driver.quit();
        }
    }

    @When("el empleado administrativo ingresa los datos solicitados, da click en buscar")
    public void elEmpleadoAdministrativoIngresaLosDatosSolicitadosDaClickEnBuscar() {
        try {
            openSourceAdmin.openLogin();
        }catch (Exception exception){
            driver.quit();
        }

    }

    @Then("el sistema debera encontrar el usuario solicitado por el administrador")
    public void elSistemaDeberaEncontrarElUsuarioSolicitadoPorElAdministrador() {
        try {
            Assertions.assertTrue(openSourceAdmin.isHomepage());
        }catch (Exception exception){
            driver.quit();
        }

        finally {
            driver.quit();
        }

    }
    }

