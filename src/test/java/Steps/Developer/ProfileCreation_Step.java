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
import org.openqa.selenium.Keys;
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

    @When("^I click Finish button$")
    public void iClickFinishButton() {
        method.click(profileCreation_ui.btnFinish);
    }

    @Then("^The error message should be shown under that field \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void theErrorMessageShouldBeShownUnderThatField(String mess1, String mess2, String mess3, String mess4, String mess5, String mess6) {
        method.compareEqual(mess1, method.getText(profileCreation_ui.errors.get(0)));
        method.compareEqual(mess2, method.getText(profileCreation_ui.errors.get(1)));
        method.compareEqual(mess3, method.getText(profileCreation_ui.errors.get(2)));
        method.compareEqual(mess4, method.getText(profileCreation_ui.errors.get(3)));
        method.compareEqual(mess5, method.getText(profileCreation_ui.errors.get(4)));
        method.compareEqual(mess6, method.getText(profileCreation_ui.errors.get(5)));
    }

    @When("^I enter in all fields$")
    public void iEnterInAllFields() throws InterruptedException {
        method.click(profileCreation_ui.ddLocation);
        Thread.sleep(5000);
        method.click(profileCreation_ui.daNang);
    }

    @When("^I enter firstname and lastname with space characters$")
    public void iEnterFirstnameAndLastnameWithSpaceCharacters() {
        method.enterData(profileCreation_ui.tbxFirstName, String.valueOf(Keys.SPACE));
        method.enterData(profileCreation_ui.tbxLastName, String.valueOf(Keys.SPACE));
    }

    @And("^I select to Position$")
    public void iSelectToPosition() {
        method.click(profileCreation_ui.ddPosition);
        method.click(profileCreation_ui.qualityAssurance);
    }

    @And("^I select to Contractual Term$")
    public void iSelectToContractualTerm() {
        method.click(profileCreation_ui.ddContractual);
        method.click(profileCreation_ui.fullEmployee);
    }

    @And("^I select to Division$")
    public void iSelectToDivision() {
        method.click(profileCreation_ui.ddDivision);
        method.click(profileCreation_ui.smdVietNam);
    }

    @And("^I select to Location$")
    public void iSelectToLocation() {
        method.click(profileCreation_ui.ddLocation);
        method.click(profileCreation_ui.daNang);
    }

    @Then("^The error message should be shown under that field \"([^\"]*)\" \"([^\"]*)\"$")
    public void theErrorMessageShouldBeShownUnderThatField(String mess1, String mess2) {
        method.compareEqual(mess1, method.getText(profileCreation_ui.errors.get(0)));
        method.compareEqual(mess2, method.getText(profileCreation_ui.errors.get(1)));
    }

    @When("^I enter data in \"([^\"]*)\" and \"([^\"]*)\" fields$")
    public void iEnterDataInAndFields(String firstname, String lastname) {
        method.enterData(profileCreation_ui.tbxFirstName, firstname);
        method.enterData(profileCreation_ui.tbxLastName, lastname);
    }


//    @Then("^The My profile page should be shown$")
//    public void theMyProfilePageShouldBeShown() {
//
//    }

    @And("^I select to new Division$")
    public void iSelectToNewDivision() {
        method.click(profileCreation_ui.ddDivision);
        method.click(profileCreation_ui.smdRussia);
    }

    @When("^I select to Location corresponding$")
    public void iSelectToLocationCorresponding() {
        method.click(profileCreation_ui.ddLocation);
        method.click(profileCreation_ui.mat_xco_va);
    }

}
