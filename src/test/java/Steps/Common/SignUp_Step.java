package Steps.Common;

import ExtensionPage.CommonMethod;
import ExtensionPage.ExcelHelpers;
import Locators.Common.SignUp_UI;
import Pages.Common.SignUp_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

public class SignUp_Step extends PageObject {

    CommonMethod method;
    SignUp_UI signUp_ui;
    SignUp_Page signUp_page;
    public ExcelHelpers excel = new ExcelHelpers();
    public void setExcel() throws Exception {
        excel.setExcelFile("src/test/resources/data/SignUpData.xlsx", "SignUpData");
    }

    @Given("^I want to open sign up page$")
    public void iWantToOpenSignUpPage() {
        signUp_page.openSignUpPage();
    }

    @When("^I want to enter all fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iWantToEnterAllFields(String firstname, String lastname, String email, String password, String confirmpassword) throws Throwable {
        signUp_page.enterAllFields(firstname,lastname,email,password,confirmpassword);
    }

    @And("^I click Sign Up button$")
    public void iClickSignUpButton() {
        method.click(signUp_ui.btnSignUpButton);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^The error message should be shown$")
    public void theErrorMessageShouldBeShown() {
        method.compareTrue(method.checkIsDisplay(signUp_ui.errFirebase));
    }

    @When("^I want to enter all fields$")
    public void iWantToEnterAllFields() throws Exception {
        setExcel();
        signUp_page.enterAllFields(
                excel.getCellData(1, 0),
                excel.getCellData(1, 1),
                excel.getCellData(1, 2),
                excel.getCellData(1, 3),
                excel.getCellData(1, 4));
    }

    @Then("^The error messages should show \"([^\"]*)\"$")
    public void theErrorMessagesShouldShow(String message) throws Throwable {
        method.compareEqual(message,method.getText(signUp_ui.errors.get(0)));
    }

    @Then("^The verify email page should show$")
    public void theVerifyEmailPageShouldShow() {
        method.compareTrue(method.checkIsDisplay(signUp_ui.txtVerifyEmail));
    }
}
