package Locators.Common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class VerifyEmail_UI  extends PageObject {

    @FindBy(xpath = "//h2[contains(text(),'Verify Email')]")
    public WebElementFacade txtVerifyEmail;

    @FindBy(className = "signup-title")
    public WebElementFacade txtVerifyEmail1;
}
