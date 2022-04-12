package TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
//        "src/test/resources/Features/Common"
        features = {"src/test/resources/Features/Project Manager/ProjectCreation"},
        tags = {"@IR-112"},
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner {
}
