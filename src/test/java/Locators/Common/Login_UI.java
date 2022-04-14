package Locators.Common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class Login_UI extends PageObject {

    @FindBy(name = "email")
    public WebElementFacade tbxEmail;

    @FindBy(name ="password")
    public WebElementFacade tbxPassword;

    @FindBy(className ="remeber-mark")
    public WebElementFacade btnRememberMe;

    @FindBy(className ="show-password")
    public WebElementFacade btnShowPassword;

    @FindBy(className = "forgot-password")
    public WebElementFacade linkForgotPassword;

    @FindBy(className = "login-form-submit-btn")
    public WebElementFacade btnLogin;

    @FindBy(className = "directional-signup-link")
    public WebElementFacade btnSignUpHere;

    @FindBy(className = "errors")
    public List<WebElementFacade> errMessage;

    @FindBy(xpath = "//p[contains(text(),'Minimum 5 characters')]")
    public WebElementFacade errPasswordMessage;

    @FindBy(xpath = "//div[contains(text(),'Email or password is invalid.')]")
    public WebElementFacade msgError;



}
