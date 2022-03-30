package Locators.Common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ResetPassword_UI extends PageObject {

//    @FindBy(xpath = "//div[contains(text(),'doesn't exists.')]")
    @FindBy(xpath ="//div[contains(text(),\"User hoainam.nv.1406@gmail.com doesn't exists.\")]")
    public WebElementFacade msgError;

    @FindBy(name = "emailFogot")
    public WebElementFacade iptEmailreset;

    @FindBy(className = "fogot-btn-submit")
    public WebElementFacade btnSendCode;

    @FindBy(className = "errors")
    public WebElementFacade errRequired;

}
