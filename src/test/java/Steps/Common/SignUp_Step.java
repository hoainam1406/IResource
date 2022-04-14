package Steps.Common;

import ExtensionPage.CommonMethod;
import ExtensionPage.ExcelHelpers;
import Locators.Common.SignUp_UI;
import Locators.Common.VerifyEmail_UI;
import Pages.Common.SignUp_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class SignUp_Step extends PageObject {

    CommonMethod method;
    SignUp_UI signUp_ui;
    SignUp_Page signUp_page;
    VerifyEmail_UI verifyEmail_ui;
    public ExcelHelpers excel = new ExcelHelpers();
    public void setExcel() throws Exception {
        excel.setExcelFile("src/test/resources/data/TestData.xlsx", "SignUpData");
    }

    @Given("^I want to open sign up page$")
    public void iWantToOpenSignUpPage() {
        signUp_page.openSignUpPage();
    }

    @When("^I want to enter all fields$")
    public void iWantToEnterAllFields() throws Exception {
        setExcel();
        signUp_page.enterAllFields(
                excel.getCellData(1, 1),
                excel.getCellData(1, 2),
                excel.getCellData(1, 3),
                excel.getCellData(1, 4),
                excel.getCellData(1, 5));
    }

    @And("^I click Sign Up button$")
    public void iClickSignUpButton() {
        method.click(signUp_ui.btnSignUpButton);
    }

    @Then("^The verify email page should show$")
    public void theVerifyEmailPageShouldShow() throws InterruptedException {
        Thread.sleep(10000);
        method.checkIsDisplay(verifyEmail_ui.txtVerifyEmail);
    }

    @When("^I leave all fields blank$")
    public void iLeaveAllFieldsBlank() {
    }

    @When("^I enter firstname and lastname contain blank space$")
    public void iEnterFirstnameAndLastnameContainBlankSpace() throws Exception {
        setExcel();
        signUp_page.enterNameFields(
                excel.getCellData(2, 1),
                excel.getCellData(2, 2));
    }

    @Then("^The error messages should show \"([^\"]*)\"$")
    public void theErrorMessagesShouldShow(String message) throws Throwable {
        method.compareEqual(message,method.getText(signUp_ui.errors.get(0)));
        method.compareEqual(message,method.getText(signUp_ui.errors.get(1)));
        method.compareEqual(message,method.getText(signUp_ui.errors.get(2)));
        method.compareEqual(message,method.getText(signUp_ui.errors.get(3)));
        method.compareEqual(message,method.getText(signUp_ui.errors.get(4)));
    }

    @Then("^The error message should be shown$")
    public void theErrorMessageShouldBeShown() {
        method.compareTrue(method.checkIsDisplay(signUp_ui.errFirebase));
    }

    @When("^I want to enter less than (\\d+) characters into Firstname and Lastname fields$")
    public void iWantToEnterLessThanCharactersIntoFirstnameAndLastnameFields(int two) throws Exception {
        setExcel();
        signUp_page.enterNameFields(
                excel.getCellData(3, 1),
                excel.getCellData(3, 2));
    }

    @Then("^That name fields's data should be added normally$")
    public void thatNameFieldsSDataShouldBeAddedNormally() {
        method.checkIsDisplay(signUp_ui.errMessageEmail);
        method.checkIsDisplay(signUp_ui.errMessagePassword);
        method.checkIsDisplay(signUp_ui.errMessageConfirmPassword);
    }

    @When("^I want to enter Firstname and Lastname contain special characters, numbers$")
    public void iWantToEnterFirstnameAndLastnameContainSpecialCharactersNumbers() throws Exception {
        setExcel();
        signUp_page.enterNameFields(
                excel.getCellData(4, 1),
                excel.getCellData(4, 2));
    }

    @Then("^The error message \"([^\"]*)\" should be shown below \"([^\"]*)\" field$")
    public void theErrorMessageShouldBeShownBelowField(String message, String field) throws Throwable {
        method.compareEqual(message,method.getText(signUp_ui.errors.get(0)));
        method.compareEqual(message,method.getText(signUp_ui.errors.get(1)));
    }

    @When("^I want to leave Firstname and Lastname fields blank$")
    public void iWantToLeaveFirstnameAndLastnameFieldsBlank() {}

    @When("^I want to enter Firstname and Lastname with (\\d+) characters$")
    public void iWantToEnterFirstnameAndLastnameWithCharacters(int arg0) throws Exception {
        setExcel();
        signUp_page.enterNameFields(
                excel.getCellData(5, 1),
                excel.getCellData(5, 2));
    }

    @When("^I want to enter Firstname and Lastname with more than (\\d+) characters$")
    public void iWantToEnterFirstnameAndLastnameWithMoreThanCharacters(int arg0) throws Exception {
        setExcel();
        signUp_page.enterNameFields(
                excel.getCellData(6, 1),
                excel.getCellData(6, 2));
    }

    @When("^I want to enter Firstname and Lastname with space characters$")
    public void iWantToEnterFirstnameAndLastnameWithSpaceCharacters() {
        method.enterData(signUp_ui.tbxFirstName, Keys.chord(Keys.SPACE,Keys.SPACE));
        method.enterData(signUp_ui.tbxLastName, Keys.chord(Keys.SPACE,Keys.SPACE));
    }

    @When("^I want to enter email contains blank space$")
    public void iWantToEnterEmailContainsBlankSpace() throws Exception {
        method.clear(signUp_ui.tbxEmail);
        setExcel();
        signUp_page.enterEmailField(excel.getCellData(7,3));
    }

    @When("^I want to enter all fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iWantToEnterAllFields(String firstname, String lastname, String email, String password, String confirmpassword) throws Throwable {
        signUp_page.enterAllFields(firstname,lastname,email,password,confirmpassword);
    }

    @When("^I want to enter an example email$")
    public void iWantToEnterAnExampleEmail() {
        method.enterData(signUp_ui.tbxEmail,"a@b");
    }

    @Then("^The error message \"([^\"]*)\" should be shown below field$")
    public void theErrorMessageShouldBeShownBelowField(String message) throws Throwable {
        method.compareEqual(message,method.getText(signUp_ui.errors.get(2)));
    }


//    @Then("^The error messages should not be show \"([^\"]*)\"$")
//    public void theErrorMessagesShouldNotBeShow(String message) throws Throwable {
//        Assert.assertEquals(message,signUp_ui.errors.get(0));
//    }
//





//

//






}
