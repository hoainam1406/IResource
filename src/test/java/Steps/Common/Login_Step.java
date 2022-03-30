package Steps.Common;

import Locators.Common.Login_UI;
import Locators.Common.Message_UI;
import Locators.Common.NavigationBar;
import Locators.Common.ResetPassword_UI;
import Pages.Common.Login_Page;
import Pages.Common.Message_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class Login_Step extends PageObject {
    Login_UI login_ui;
    Login_Page login_Page;
    NavigationBar navigationBar;
    ResetPassword_UI resetPassword_ui;

    @Given("^I want to open login page$")
    public void iWantToOpenLoginPage() {
        login_Page.open();
    }

    @And("^I click Login button$")
    public void iClickLoginButton() {
        login_Page.clickLoginButton();
    }

    @Then("^The Profile information should show \"([^\"]*)\"$")
    public void theProfileInformationShouldShow(String url) throws Throwable {
        Assert.assertEquals(login_Page.pageUrlValidation(),url);
    }

    @Then("^The Error message should show$")
    public void theErrorMessageShouldShow(){
        Assert.assertTrue(login_ui.msgError.isDisplayed());
    }

    @Then("^The manage project page should show \"([^\"]*)\"$")
    public void theManageProjectPageShouldShow(String url) throws Throwable {
        Assert.assertEquals(login_Page.pageUrlValidation(),url);
    }

    @Then("^The explore project page should show \"([^\"]*)\"$")
    public void theExploreProjectPageShouldShow(String url) throws Throwable {
        Assert.assertEquals(login_Page.pageUrlValidation(),url);
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String email, String password) throws Throwable {
        login_Page.enterEmail(email);
        login_Page.enterPassword(password);
    }

    @And("^I check the remember me checkbox$")
    public void iCheckTheRememberMeCheckbox() {
        login_Page.clickRememberMe();
    }

    @Then("^I click Log out button$")
    public void iClickLogOutButton() {
        navigationBar.btnLogout.click();
    }

    @Then("^The user data: \"([^\"]*)\" and \"([^\"]*)\" should be saved$")
    public void theUserDataAndShouldBeSaved(String email, String password) throws Throwable {
        Assert.assertEquals(email,login_ui.tbxEmail.getTextValue());
        Assert.assertEquals(password,login_ui.tbxPassword.getTextValue());
    }

    @Then("^The user data: email and password should not be saved$")
    public void theUserDataEmailAndPasswordShouldNotBeSaved() {
        Assert.assertEquals("",login_ui.tbxEmail.getTextValue());
        Assert.assertEquals("",login_ui.tbxPassword.getTextValue());
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String password) throws Throwable {
        login_Page.enterPassword(password);
    }

    @And("^I click show-password icon$")
    public void iClickShowPasswordIcon() {
        login_Page.clickShowPasswordIcon();
    }

    @Then("^The password data should show \"([^\"]*)\"$")
    public void thePasswordDataShouldShow(String password) throws Throwable {
        Assert.assertEquals(password,login_ui.tbxPassword.getTextValue());
    }

    @When("^I click the Forgot password button$")
    public void iClickTheForgotPasswordButton() {
        login_Page.clickForgotPassword();
    }

    @Then("^The Forgot password page should show \"([^\"]*)\"$")
    public void theForgotPasswordPageShouldShow(String url) throws Throwable {
        Assert.assertEquals(url,login_Page.pageUrlValidation());
    }

    @And("^I enter the \"([^\"]*)\" address$")
    public void iEnterTheAddress(String email) throws Throwable {
        resetPassword_ui.iptEmailreset.sendKeys(email);
    }

    @And("^I click send code button$")
    public void iClickSendCodeButton() {
        resetPassword_ui.btnSendCode.click();
    }

    @Then("^The error message should be shown \"([^\"]*)\"$")
    public void theErrorMessageShouldBeShown(String message) throws Throwable {
        Assert.assertTrue(resetPassword_ui.msgError.getText().contains(message));
    }

    @Then("^The error \"([^\"]*)\" should be shown$")
    public void theErrorShouldBeShown(String message) throws Throwable {
        Assert.assertEquals(message,resetPassword_ui.errRequired.getText());
    }

    @When("^I click the Sign Up Here button$")
    public void iClickTheSignUpHereButton() {
        login_Page.clickSignUpHere();
    }

    @And("^The Sign Up Here page should show \"([^\"]*)\"$")
    public void theSignUpHerePageShouldShow(String url) throws Throwable {
        Assert.assertEquals(url,login_Page.pageUrlValidation());
    }

    @Then("^The Error message should show under that field \"([^\"]*)\"$")
    public void theErrorMessageShouldShowUnderThatField(String message1) throws Throwable {

    }

    @Then("^The Error message should show under that fields \"([^\"]*)\" \"([^\"]*)\"$")
    public void theErrorMessageShouldShowUnderThatFields(String message1, String message2) throws Throwable {
        Assert.assertEquals(message1,login_ui.errEmailMessage.getText());
        Assert.assertEquals(message2,login_ui.errPasswordMessage.getText());
    }

    @When("^I enter invalid \"([^\"]*)\"$")
    public void iEnterInvalid(String email) throws Throwable {
        login_Page.enterEmail(email);
    }

}
