package Pages.ProjectManager.ProjectCreation_Page;

import ExtensionPage.CommonMethod;
import ExtensionPage.ExcelHelpers;
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

    public ExcelHelpers excel = new ExcelHelpers();
    public void setExcel() throws Exception {
        excel.setExcelFile("src/test/resources/data/SignUpData.xlsx", "LoginData");
    }

    public void openPurposePitchPage() throws Exception {
        setExcel();
        login_page.openLoginPage();
        login_page.enterAllFields(
                excel.getCellData(1, 0),
                excel.getCellData(1, 1));
        method.click(login_ui.btnLogin);
        method.click(manageProject_ui.btnAddNew);
    }
    public void enterFields (String startDate, String endDate, String projectName, String problemStatement, String bigVision, String valueProposition, String customer){
        method.enterData(purposePitch_ui.tbxStartDate,startDate );
        method.enterData(purposePitch_ui.tbxEndDate,endDate );
        method.enterData(purposePitch_ui.tbxProjectName,projectName );
        method.enterData(purposePitch_ui.tbxProStatement,problemStatement );
        method.enterData(purposePitch_ui.tbxBigVision,bigVision );
        method.enterData(purposePitch_ui.tbxValueProposition,valueProposition );
        method.enterData(purposePitch_ui.tbxCustomer,customer );
    }
    public void clear(){
        method.clear(purposePitch_ui.tbxProjectName);
        method.clear(purposePitch_ui.endDate);
        method.clear(purposePitch_ui.startDate);
        method.clear(purposePitch_ui.tbxProStatement);
        method.clear(purposePitch_ui.tbxBigVision);
        method.clear(purposePitch_ui.tbxValueProposition);
        method.clear(purposePitch_ui.tbxCustomer);
        method.clear(purposePitch_ui.tbxRevenueStreams);
    }

}
