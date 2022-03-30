package TestRunner.Common;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/Features/Common/Login.feature"},
        tags = {"@Login"},
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class Login_Test {
}
