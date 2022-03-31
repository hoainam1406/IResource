package Pages.Common;

import Locators.Common.Login_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://iresource.smartdev.vn/login")
public class Login_Page extends PageObject {
    Login_UI login_ui;

    public void openLoginPage(){
        open();
    }

    public void clickLoginButton(){
        login_ui.btnLogin.click();
    }

    public void clickRememberMe(){
        login_ui.btnRememberMe.click();
    }

    public void clickForgotPassword(){
        login_ui.linkForgotPassword.click();
    }

    public void clickSignUpHere(){
        login_ui.btnSignUpHere.click();
    }

    public void clickShowPasswordIcon(){
        login_ui.btnShowPassword.click();
    }

    public String pageUrlValidation(){
        return getDriver().getCurrentUrl();
    }

    public void enterEmail(String email){
        login_ui.tbxEmail.sendKeys(email);
    }

    public void enterPassword(String password){
        login_ui.tbxPassword.sendKeys(password);
    }




}
