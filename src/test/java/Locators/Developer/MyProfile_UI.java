package Locators.Developer;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyProfile_UI extends PageObject {

    @FindBy (className = "my-profile")
    public WebElementFacade navigationBar;

    @FindBy (className = "button_top")
    public WebElementFacade editIcon;

    @FindBy (className = "community-icon")
    public WebElementFacade communityIcon;

    @FindBy (className = "workexperiences-close")
    public WebElementFacade closeIcon;

    @FindBy (xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/li[1]/div[1]/*[1]")
    public WebElementFacade xIcon;

    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[2]")
    public WebElementFacade btnDelete;

    @FindBy (className = "button__cancel btn")
    public WebElementFacade btnCancel;

    @FindBy (xpath = "//button[contains(text(),'Finish')]")
    public WebElementFacade btnFinish;

    @FindBy (className = "certifications-description-item")
    public WebElementFacade certiItem;

    @FindBy (className = "badges-header")
    public WebElementFacade badgeHeader;

    @FindBy (id = "name")
    public WebElementFacade txbName;

    @FindBy (className = "workexperiences-title")
    public WebElementFacade title;

    @FindBy (className = "errors")
    public WebElementFacade errors;

    @FindBy (className = "Toastify__toast-body")
    public WebElementFacade message;
}
