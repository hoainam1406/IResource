package Pages.Common;

import Locators.Common.SignUp_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

@DefaultUrl("https://iresource.smartdev.vn/signup")
public class SignUp_Page extends PageObject {
    SignUp_UI signUp_ui;

    public void openSignUpPage(){
        open();
    }

    public void clickInternalPersonaRole(){
        signUp_ui.boxInternalPersona.click();
    }

    public void clickProjectCreatorRole(){}

    public void clickSignUpbutton(){
        signUp_ui.btnSignUpButton.click();
    }

    public void clickLogInHereButton(){
        signUp_ui.btnLogInHere.click();
    }

    public void clickShowPassword(){
        signUp_ui.btnShowPassword.click();
    }

    public void clickShowConfirmPassword(){
        signUp_ui.btnShowConfirmPassword.click();
    }

    public void enterFirstname(String firstname){
        signUp_ui.tbxFirstName.sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        signUp_ui.tbxLastName.sendKeys(lastname);
    }

    public void enterEmail(String email){
        signUp_ui.tbxEmail.sendKeys(email);
    }

    public void enterPassword(String password){
        signUp_ui.tbxPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword){
        signUp_ui.tbxConfirmPassword.sendKeys(confirmpassword);
    }

    public void enterAllFields(String firstname, String lastname, String email, String password, String confirmpassword ){
        signUp_ui.tbxFirstName.sendKeys(firstname);
        signUp_ui.tbxLastName.sendKeys(lastname);
        signUp_ui.tbxEmail.sendKeys(email);
        signUp_ui.tbxPassword.sendKeys(password);
        signUp_ui.tbxConfirmPassword.sendKeys(confirmpassword);
    }

    public String pageUrlValidation(){
        return getDriver().getCurrentUrl();
    }

}
