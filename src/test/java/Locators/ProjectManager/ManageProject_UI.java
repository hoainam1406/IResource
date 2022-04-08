package Locators.ProjectManager;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ManageProject_UI extends PageObject {

    @FindBy(className ="add-new")
    public WebElementFacade btnAddNew;
}
