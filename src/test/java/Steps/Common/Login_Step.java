package Steps.Common;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Locators.Common.NavigationBar;
import Locators.Common.ResetPassword_UI;
import Pages.Common.Login_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class Login_Step extends PageObject {
    Login_UI login_ui;
    Login_Page login_Page;
    NavigationBar navigationBar;
    ResetPassword_UI resetPassword_ui;
    CommonMethod method;


    @Given("^I want to open login page$")
    public void iWantToOpenLoginPage() {
        login_Page.openLoginPage();
    }

    @And("^I click Login button$")
    public void iClickLoginButton() {
        method.click(login_ui.btnLogin);
    }

    @Then("^The Corresponding page should show with URL \"([^\"]*)\"$")
    public void theCorrespondingPageShouldShowWithURL(String url) throws Throwable {
        method.compareEqual(url, method.getUrl());
    }

    @Then("^The Profile information should show \"([^\"]*)\"$")
    public void theProfileInformationShouldShow(String url) throws Throwable {
        method.compareEqual(url, method.getUrl());
    }

    @Then("^The Error message should show$")
    public void theErrorMessageShouldShow(){
        method.compareTrue(method.checkIsDisplay(login_ui.msgError));
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String email, String password) throws Throwable {
        method.enterData(login_ui.tbxEmail,email);
        method.enterData(login_ui.tbxPassword,password);
    }

    @And("^I check the remember me checkbox$")
    public void iCheckTheRememberMeCheckbox() {
        method.click(login_ui.btnRememberMe);
    }

    @Then("^I click Log out button$")
    public void iClickLogOutButton() {
        method.click(navigationBar.btnLogout);
    }

    @Then("^The user data: \"([^\"]*)\" and \"([^\"]*)\" should be saved$")
    public void theUserDataAndShouldBeSaved(String email, String password) throws Throwable {
        method.compareEqual(email, method.getAtrribute(login_ui.tbxEmail,"value"));
        method.compareEqual(password, method.getAtrribute(login_ui.tbxPassword,"value"));
    }

    @Then("^The user data: email and password should not be saved$")
    public void theUserDataEmailAndPasswordShouldNotBeSaved() {
        method.compareEqual("", method.getAtrribute(login_ui.tbxEmail,"value"));
        method.compareEqual("", method.getAtrribute(login_ui.tbxPassword,"value"));
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String password) throws Throwable {
        method.enterData(login_ui.tbxPassword,password);
    }

    @And("^I click show-password icon$")
    public void iClickShowPasswordIcon() {
        method.click(login_ui.btnShowPassword);
    }

    @Then("^The password data should show \"([^\"]*)\"$")
    public void thePasswordDataShouldShow(String password) throws Throwable {
        method.compareEqual(password, method.getAtrribute(login_ui.tbxPassword,"value"));
    }

    @When("^I click the Forgot password button$")
    public void iClickTheForgotPasswordButton() {
        method.click(login_ui.linkForgotPassword);
    }

    @Then("^The Forgot password page should show \"([^\"]*)\"$")
    public void theForgotPasswordPageShouldShow(String url) throws Throwable {
        method.compareEqual(url,method.getUrl());
    }


    @And("^I enter the \"([^\"]*)\" address$")
    public void iEnterTheAddress(String email) throws Throwable {
        method.enterData(resetPassword_ui.iptEmailreset,email);
    }

    @And("^I click send code button$")
    public void iClickSendCodeButton() {
        method.click(resetPassword_ui.btnSendCode);
    }

    @Then("^The error message should be shown \"([^\"]*)\"$")
    public void theErrorMessageShouldBeShown(String message) throws Throwable {
        method.compareTrue(method.getText(resetPassword_ui.msgError).contains(message));
    }

    @Then("^The error \"([^\"]*)\" should be shown$")
    public void theErrorShouldBeShown(String message) throws Throwable {
        method.compareEqual(message, method.getText(resetPassword_ui.errRequired));
    }

    @When("^I click the Sign Up Here button$")
    public void iClickTheSignUpHereButton() {
        method.click(login_ui.btnSignUpHere);
    }

    @And("^The Sign Up Here page should show \"([^\"]*)\"$")
    public void theSignUpHerePageShouldShow(String url) throws Throwable {
        method.compareEqual(url, method.getUrl());
    }

    @Then("^The Error message should show under that field \"([^\"]*)\"$")
    public void theErrorMessageShouldShowUnderThatField(String message1) throws Throwable {

    }

    @Then("^The Error message should show under that fields \"([^\"]*)\" \"([^\"]*)\"$")
    public void theErrorMessageShouldShowUnderThatFields(String message1, String message2) throws Throwable {
        method.compareEqual(message1,method.getText(login_ui.errEmailMessage));
        method.compareEqual(message2,method.getText(login_ui.errPasswordMessage));
    }

    @When("^I enter invalid \"([^\"]*)\"$")
    public void iEnterInvalid(String email) throws Throwable {
        method.enterData(login_ui.tbxEmail,email);
    }


}
