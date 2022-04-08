package Steps.ProjectManager.ProjectCreation_Step;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Locators.ProjectManager.ManageProject_UI;
import Locators.ProjectManager.ProjectCreation_UI.PurposePitch_UI;
import Pages.Common.Login_Page;
import Pages.ProjectManager.ProjectCreation_Page.PurposePitch_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PurposePitch_Step extends PageObject {
    PurposePitch_UI purposePitch_ui;
    PurposePitch_Page purposePitch_page;
    CommonMethod method;
    Login_UI login_ui;
    Login_Page login_Page;
    ManageProject_UI manageProject_ui;

    @Given("^I want to open Project Creation page after logging$")
    public void iWantToOpenProjectCreationPageAfterLogging() {
        purposePitch_page.openPurposePitchPage();
    }

    @When("^I click Upload icon$")
    public void iClickUploadIcon() {
        method.click(purposePitch_ui.btnUploadThumbnail);
    }

    @And("^I select a \"([^\"]*)\"$")
    public void iSelectA(String thumbnail) throws Throwable {
//        Thread.sleep(5000);
//        method.enterData(purposePitch_ui.idThumbnail,thumbnail);
//        Thread.sleep(5000);
        purposePitch_ui.idThumbnail.sendKeys("/Users/nguyenthituongvy/Documents/images/Screen Shot 2022-04-06 at 14.35.14.png");
    }
    @Then("^The thumbnail should be shown$")
    public void theThumbnailShouldBeShown() {

    }


    @And("^I click the Finish button$")
    public void iClickTheFinishButton() throws InterruptedException {
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView();", purposePitch_ui.btnFinish);
        Actions action = new Actions(getDriver());
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        action.click(purposePitch_ui.btnFinish).build().perform();

    }

    @Then("^The error \"([^\"]*)\" should be shown below the field Project name$")
    public void theErrorShouldBeShownBelowTheFieldProjectName(String message)  {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errProjectName));
    }
    @And("^I enter data in \"([^\"]*)\" field$")
    public void iEnterDataInField(String projectName) {
        method.enterData(purposePitch_ui.tbxProjectName,projectName);
    }

    @Then("^No error message is shown$")
    public void noErrorMessageIsShown() {
        method.scrollUp();
        method.compareFalse(method.checkIsDisplay(purposePitch_ui.errProjectName));
    }

    @And("^I select a Thumbnail$")
    public void iSelectAThumbnail() {
        purposePitch_ui.idThumbnail.sendKeys(method.getFile());
    }


    @Then("^The error \"([^\"]*)\" should be shown below the Status field$")
    public void theErrorShouldBeShownBelowTheStatusField(String message)  {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errStatus));
    }

    @And("^I select the Public radio button$")
    public void iSelectThePublicRadioButton() {
        method.click(purposePitch_ui.rbnPublic);
    }


    @Then("^The Public radio button is selected$")
    public void thePublicRadioButtonIsSelected() {

    }

    @And("^I reselect the Confidential radio button$")
    public void iReselectTheConfidentialRadioButton() {
        method.click(purposePitch_ui.rbnConfidential);
    }
    @Then("^The Confidential radio button is selected$")
    public void theConfidentialRadioButtonIsSelected() {
        method.compareTrue(method.checkSelected(purposePitch_ui.rbnConfidential));
    }


    @And("^I click on any date box$")
    public void iClickOnAnyDateBox() {
        method.click(purposePitch_ui.tbxStartDate);
    }

    @Then("^The calendar is openable$")
    public void theCalendarIsOpenable() {
        method.compareTrue(method.checkIsDisplay(purposePitch_ui.datePicker));
    }


    @When("^I select the Start date$")
    public void iSelectTheStartDate() {
        method.click(purposePitch_ui.tbxStartDate);
        method.click(purposePitch_ui.startDate);

    }

    @And("^I select the End date$")
    public void iSelectTheEndDate() {
        method.click(purposePitch_ui.tbxEndDate);
        method.click(purposePitch_ui.previousMonth);
        method.click(purposePitch_ui.endDate);
    }


    @Then("^The error \"([^\"]*)\" is shown below the End date field$")
    public void theErrorIsShownBelowTheEndDateField(String message) {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errEndDate));
    }
}
