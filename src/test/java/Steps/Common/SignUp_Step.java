package Steps.Common;

import ExtensionPage.ExcelHelpers;
import Locators.Common.SignUp_UI;
import Pages.Common.SignUp_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class SignUp_Step extends PageObject {

    SignUp_UI signUp_ui;
    SignUp_Page signUp_page;
    public ExcelHelpers excel = new ExcelHelpers();
    public void setExcel() throws Exception {
        excel.setExcelFile("src/test/resources/SignUpData.xlsx", "SignUpData");
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
        signUp_page.clickSignUpbutton();
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("^The error message should be shown$")
    public void theErrorMessageShouldBeShown() {
        Assert.assertTrue(signUp_ui.errFirebase.isDisplayed());
    }

    @When("^I want to enter all fields$")
    public void iWantToEnterAllFields() throws Exception {
        setExcel();
        signUp_page.enterAllFields(
                excel.getCellData(3, 0),
                excel.getCellData(3, 1),
                excel.getCellData(3, 2),
                excel.getCellData(3, 3),
                excel.getCellData(3, 4));
    }

    @Then("^The error messages should show \"([^\"]*)\"$")
    public void theErrorMessagesShouldShow(String message) throws Throwable {
        Assert.assertEquals(message,signUp_ui.errors.get(0).getText());
    }

    @Then("^The verify email page should show$")
    public void theVerifyEmailPageShouldShow() {
        Assert.assertTrue(signUp_ui.txtVerifyEmail.isDisplayed());
    }
}
