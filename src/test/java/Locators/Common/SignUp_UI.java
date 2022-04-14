package Locators.Common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUp_UI extends PageObject {

    @FindBy(className = "errors")
    public List<WebElementFacade> errors;

    @FindBy(xpath = "//input[@id='card1']")
    public WebElementFacade boxInternalPersona;

    @FindBy(css = "#card2")
    public WebElementFacade boxProjectCreator;

    @FindBy(xpath = "//div[contains(text(),'Firebase: Error (auth/email-already-in-use).')]")
    public WebElementFacade errFirebase;

    @FindBy(name = "firstname")
    public WebElementFacade tbxFirstName;

    @FindBy(name = "lastname")
    public WebElementFacade tbxLastName;

    @FindBy(name = "email")
    public WebElementFacade tbxEmail;

    @FindBy(name = "password")
    public WebElementFacade tbxPassword;

    @FindBy(name = "confirmPassword")
    public WebElementFacade tbxConfirmPassword;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[6]/button[1]")
    public WebElementFacade btnSignUpButton;

    @FindBy(className = "font-weight-bold")
    public WebElementFacade btnLogInHere;

    @FindBy(className = "fa fa-eye-slash")
    public WebElementFacade btnShowPassword;

    @FindBy(className = "input-group-text")
    public WebElementFacade btnShowConfirmPassword;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/p[1]")
    public WebElementFacade errMessageEmail;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/p[1]")
    public WebElementFacade errMessagePassword;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[5]/p[1]")
    public WebElementFacade errMessageConfirmPassword;

    @FindBy(xpath = "///p[contains(text(),'Invalid email format')]")
    public WebElementFacade errInvalidEmail;

}
