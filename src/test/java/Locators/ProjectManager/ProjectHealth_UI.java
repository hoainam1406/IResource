package Locators.ProjectManager;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProjectHealth_UI extends PageObject {
    @FindBy(className = "project-info-title")
    public WebElementFacade titleProHealth;
}
