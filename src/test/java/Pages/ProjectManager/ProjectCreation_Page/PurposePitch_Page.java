package Pages.ProjectManager.ProjectCreation_Page;

import ExtensionPage.CommonMethod;
import Locators.Common.Login_UI;
import Locators.ProjectManager.ManageProject_UI;
import Locators.ProjectManager.ProjectCreation_UI.PurposePitch_UI;
import Pages.Common.Login_Page;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://iresource.smartdev.vn/project-creation")
public class PurposePitch_Page extends PageObject {
    PurposePitch_UI purposePitch_ui;
    Login_Page login_page;
    Login_UI login_ui;
    CommonMethod method;
    ManageProject_UI manageProject_ui;

    public void openPurposePitchPage(){
        login_page.openLoginPage();
        method.enterData(login_ui.tbxEmail,"hoainam.nv.1406+test16@gmail.com");
        method.enterData(login_ui.tbxPassword,"Hoainam1406@");
        method.click(login_ui.btnLogin);
        method.click(manageProject_ui.btnAddNew);
    }

}
