package Pages.Common;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://iresource.smartdev.vn/login")
public class Login_Page extends PageObject {
    Login_UI login_ui;
    CommonMethod method;

    public void openLoginPage(){
        open();
    }

    public void enterEmailPasswordField(String email, String password){
        method.enterData(login_ui.tbxEmail,email);
        method.enterData(login_ui.tbxPassword,password);
    }

    public void enterEmail(String email){
        method.enterData(login_ui.tbxEmail,email);
    }

    public void enterPassword(String password){
        method.enterData(login_ui.tbxPassword,password);
    }
}
