package Locators.Developer;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfileCreation_UI extends PageObject {

    @FindBy (id = "firstName")
    public WebElementFacade tbxFirstName;

    @FindBy (id = "lastName")
    public WebElementFacade tbxLastName;

    //@FindBy (className = "custom-select__placeholder css-1wa3eu0-placeholder")
    //public List<WebElementFacade> drpdownPlaceholder;

    //@FindBy (className = "custom-select__single-value css-1uccc91-singleValue")
    //public List<WebElementFacade> drpdownValue;

    @FindBy (css = "div[id='position'] div[class='custom-select__control css-yk16xz-control']")
    public WebElementFacade ddPosition;

    @FindBy (xpath = "//div[contains(text(),'Quality Assurance')]")
    public WebElementFacade qualityAssurance;

    @FindBy (css = "div[id='contractualTerm'] div[class='custom-select__control css-yk16xz-control']")
    public WebElementFacade ddContractual;

    @FindBy (xpath = "//div[contains(text(),'Fulltime employee')]")
    public WebElementFacade fullEmployee;

    @FindBy (css = "div[id='division'] div[class='custom-select__control css-yk16xz-control']")
    public WebElementFacade ddDivision;

    @FindBy (xpath = "//div[contains(text(),'SmartDev Vietnam')]")
    public WebElementFacade smdVietNam;

    @FindBy (xpath = "//div[contains(text(),'SmartDev Russia')]")
    public WebElementFacade smdRussia;

    @FindBy (css = "div[id='location'] div[class='custom-select__control css-yk16xz-control']")
    public WebElementFacade ddLocation;

    @FindBy (xpath = "//div[contains(text(),'Da Nang')]")
    public WebElementFacade daNang;

    @FindBy (xpath = "//div[contains(text(),'Mát-xcơ-va')]")
    public WebElementFacade mat_xco_va;

    @FindBy (className = "errors")
    public List<WebElementFacade> errors;

    @FindBy (xpath = "//button[normalize-space()='Finish']")
    public WebElementFacade btnFinish;
}
