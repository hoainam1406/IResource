package Steps.ProjectManager.ProjectCreation_Step;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Locators.ProjectManager.ManageProject_UI;
import Locators.ProjectManager.ProjectCreation_UI.PurposePitch_UI;
import Locators.ProjectManager.ProjectHealth_UI;
import Pages.Common.Login_Page;
import Pages.ProjectManager.ProjectCreation_Page.PurposePitch_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PurposePitch_Step extends PageObject {
    PurposePitch_UI purposePitch_ui;
    PurposePitch_Page purposePitch_page;
    CommonMethod method;
    ProjectHealth_UI projectHealth_ui;

    @Given("^I want to open Project Creation page after logging$")
    public void iWantToOpenProjectCreationPageAfterLogging() throws Exception {
        purposePitch_page.openPurposePitchPage();
       // purposePitch_page.clear();
    }

    @When("^I click Upload icon$")
    public void iClickUploadIcon() {
        method.click(purposePitch_ui.btnUploadThumbnail);
    }
    @And("^I select a Thumbnail$")
    public void iSelectAThumbnail() {
        purposePitch_ui.idThumbnail.sendKeys("/Users/nguyenthituongvy/Documents/images/pexels-photo-302743.jpeg");
    }

    @Then("^The thumbnail should be shown$")
    public void theThumbnailShouldBeShown() {

    }

    @And("^I click the Finish button$")
    public void iClickTheFinishButton() throws InterruptedException {
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView();", purposePitch_ui.btnFinish);
        Actions action = new Actions(getDriver());
       // getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(1000);
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
        method.compareTrue(method.checkSelected(purposePitch_ui.rbnPublic));
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

    @Then("^The errors \"([^\"]*)\" and \"([^\"]*)\" are shown below the Start date and End date field$")
    public void theErrorsAndAreShownBelowTheStartDateAndEndDateField(String message1, String message2){
        method.scrollUp();
        method.compareEqual(message1,method.getText(purposePitch_ui.errStartDate));
        method.compareEqual(message2,method.getText(purposePitch_ui.errEndDate));
    }

    @Then("^The error \"([^\"]*)\" should be shown below the Start date$")
    public void theErrorShouldBeShownBelowTheStartDate(String message) {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errStartDate));
    }

    @Then("^The error \"([^\"]*)\" should be shown below the End date$")
    public void theErrorShouldBeShownBelowTheEndDate(String message)  {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errEndDate));
    }

    @Then("^The error \"([^\"]*)\" should be shown below the field Problem Statement$")
    public void theErrorShouldBeShownBelowTheFieldProblemStatement(String message) {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errProblemStatement));
    }



    @Then("^The Project Health page is shown with \"([^\"]*)\"$")
    public void theProjectHealthPageIsShownWith(String title) throws InterruptedException {
        method.compareEqual(title,method.getText(projectHealth_ui.titleProHealth));
    }

    @When("^I enter spaces in Project name field$")
    public void iEnterSpacesInProjectNameField() {
//        Keys.chord():chuỗi các key
        method.enterData(purposePitch_ui.tbxProjectName, Keys.chord(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE));
    }

    @When("^I enter \"([^\"]*)\" in Problem Statement field$")
    public void iEnterInProblemStatementField(String problemStatement) {
        method.enterData(purposePitch_ui.tbxProStatement,problemStatement);
    }

    @Then("^The error \"([^\"]*)\" should be shown below the field The big vision$")
    public void theErrorShouldBeShownBelowTheFieldTheBigVision(String message)  {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errBigVision));
    }

    @When("^I enter \"([^\"]*)\" in The big vision field$")
    public void iEnterInTheBigVisionField(String bigVision) {
        method.enterData(purposePitch_ui.tbxBigVision,bigVision);
    }

    @Then("^The error \"([^\"]*)\" should be shown below the field Value Proposition$")
    public void theErrorShouldBeShownBelowTheFieldValueProposition(String message){
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errValueProposition));
    }

    @When("^I enter \"([^\"]*)\" in Value Proposition field$")
    public void iEnterInValuePropositionField(String valueProposition){
        method.enterData(purposePitch_ui.tbxValueProposition,valueProposition);
    }

    @Then("^The error \"([^\"]*)\" should be shown below the field Customer$")
    public void theErrorShouldBeShownBelowTheFieldCustomer(String message) {
        method.scrollUp();
        method.compareEqual(message,method.getText(purposePitch_ui.errCustomer));
    }

    @When("^I enter \"([^\"]*)\" in Customer field$")
    public void iEnterInCustomerField(String customer) {
        method.enterData(purposePitch_ui.tbxCustomer, customer);
    }

    @And("^I enter \"([^\"]*)\" in Revenue Streams field$")
    public void iEnterInRevenueStreamsField(String revenueStreams) {
        method.enterData(purposePitch_ui.tbxRevenueStreams, revenueStreams);
    }

    @And("^I enter data in \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" fields$")
    public void iEnterDataInFields(String startDate, String endDate, String projectName, String problemStatement, String bigVision, String valueProposition, String customer) {
        purposePitch_page.enterFields(startDate, endDate, projectName, problemStatement, bigVision, valueProposition, customer);
    }


    @When("^I enter spaces in Problem Statement field$")
    public void iEnterSpacesInProblemStatementField() {
        method.enterData(purposePitch_ui.tbxProStatement, Keys.chord(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE));
    }

    @When("^I enter spaces in the Big Vision field$")
    public void iEnterSpacesInTheBigVisionField() {
        method.enterData(purposePitch_ui.tbxBigVision, Keys.chord(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE));
    }

    @When("^I enter spaces in the Value Proposition field$")
    public void iEnterSpacesInTheValuePropositionField() {
        method.enterData(purposePitch_ui.tbxValueProposition, Keys.chord(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE));
    }

    @When("^I enter spaces in the Customer field$")
    public void iEnterSpacesInTheCustomerField() {
        method.enterData(purposePitch_ui.tbxCustomer, Keys.chord(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.SPACE));
    }
}
