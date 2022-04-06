package TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Internal Persona/Login.feature"},
        tags = {"@0"},
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class Test2Runner {
}