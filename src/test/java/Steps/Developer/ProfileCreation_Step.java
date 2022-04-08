package Steps.Developer;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Locators.Developer.ProfileCreation_UI;
import Pages.Common.Login_Page;
import Pages.Developer.ProfileCreation_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProfileCreation_Step extends PageObject {

    CommonMethod method;
    ProfileCreation_UI profileCreation_ui;
    ProfileCreation_Page profileCreation_page;
    Login_Page login_page;
    Login_UI login_ui;

    @Given("^I want to open Profile Information page$")
    public void iWantToOpenProfileInformationPage() {
        profileCreation_page.openProfileCreationPage();
    }

    @When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnter(String lastname, String position, String contractual, String division, String location) throws Throwable {
        method.enterData(profileCreation_ui.tbxLastName, lastname);
        //method.click(profileCreation_ui.drpdownPlaceholder.get(1));
        //method.click(profileCreation_ui.drpdownValue.get(1));
        //System.out.println(position);
    }

    @And("^I click Finish button$")
    public void iClickFinishButton() {
        method.click(profileCreation_ui.btnFinish);
    }

    @Then("^The error message should be shown under that field \"([^\"]*)\"$")
    public void theErrorMessageShouldBeShownUnderThatField(String message) throws Throwable {
        method.compareEqual(message,method.getText(profileCreation_ui.errors.get(0)));
    }
}
