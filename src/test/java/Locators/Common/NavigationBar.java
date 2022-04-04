package Locators.Common;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends PageObject {

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/i[1]")
    public WebElementFacade btnLogout;


}
