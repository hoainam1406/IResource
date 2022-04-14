package Pages.Developer;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Pages.Common.Login_Page;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://iresource.smartdev.vn/login")
public class ProfileCreation_Page extends PageObject {

    Login_Page login_page;
    Login_UI login_ui;
    CommonMethod method;

    public void openProfileCreationPage(){
        login_page.openLoginPage();
        method.enterData(login_ui.tbxEmail,"olwen.nguyen@mailsac.com");
        method.enterData(login_ui.tbxPassword,"Olwen@1234");
        method.click(login_ui.btnLogin);
    }
}
