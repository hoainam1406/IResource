package Pages.Common;

import ExtensionPage.CommonMethod;
import Locators.Common.SignUp_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

@DefaultUrl("https://iresource.smartdev.vn/signup")
public class SignUp_Page extends PageObject {
    SignUp_UI signUp_ui;
    CommonMethod method;

    public void openSignUpPage(){
        open();
    }

    public void enterAllFields(String firstname, String lastname, String email, String password, String confirmpassword ){
        method.enterData(signUp_ui.tbxFirstName,firstname);
        method.enterData(signUp_ui.tbxLastName,lastname);
        method.enterData(signUp_ui.tbxEmail,email);
        method.enterData(signUp_ui.tbxPassword,password);
        method.enterData(signUp_ui.tbxConfirmPassword,confirmpassword);
    }

    public void enterNameFields(String firstname, String lastname){
        method.enterData(signUp_ui.tbxFirstName,firstname);
        method.enterData(signUp_ui.tbxLastName,lastname);
    }

    public void enterEmailField(String email){
        method.enterData(signUp_ui.tbxEmail,email);
    }

    public void enterPasswordField(String password){
        method.enterData(signUp_ui.tbxPassword,password);
    }

    public void enterConfirmPasswordField(String confirmpassword){
        method.enterData(signUp_ui.tbxPassword,confirmpassword);
    }
}
