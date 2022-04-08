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

    @FindBy (className = "custom-select__placeholder css-1wa3eu0-placeholder")
    public List<WebElementFacade> drpdownPlaceholder;

    @FindBy (className = "custom-select__single-value css-1uccc91-singleValue")
    public List<WebElementFacade> drpdownValue;

    @FindBy (className = "errors")
    public List<WebElementFacade> errors;

    @FindBy (className = "btn btn-md my-3 modal-info-person-button")
    public WebElementFacade btnFinish;
}
