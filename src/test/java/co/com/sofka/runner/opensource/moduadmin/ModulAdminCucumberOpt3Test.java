package co.com.sofka.runner.opensource.moduadmin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        features = {"src/test/resources/features/webui/opensource/moduadmin.feature"},
        glue = {"co.com.sofka.stepdefinition.opensource.opt1"},
        tags = "not @Regresion"

)

public class ModulAdminCucumberOpt3Test {
}
