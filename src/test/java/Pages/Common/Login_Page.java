package Pages.Common;

import Locators.Common.Login_UI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://iresource.smartdev.vn/login")
public class Login_Page extends PageObject {
    Login_UI login_ui;

    public void openLoginPage(){
        open();
    }
}
