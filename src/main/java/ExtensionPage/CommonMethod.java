package ExtensionPage;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CommonMethod extends PageObject {

    public void click(WebElement element) {
        element.click();
    }

    public void enterData(WebElement element, String content){
        element.sendKeys(content);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void clear(WebElement element){
        element.clear();
    }

    public void checkSelected(WebElement element){
        element.isSelected();
    }

    public boolean checkIsDisplay(WebElement element) {
        return element.isDisplayed();
    }

    public void checkIsEnable(WebElement element){
        element.isEnabled();
    }

    public String getAtrribute(WebElementFacade element, String value){
      return element.getAttribute(value);
    }

    public void RefreshPage() {
        getDriver().navigate().refresh();
    }

    public String getUrl(){
        return getDriver().getCurrentUrl();
    }

    public void compareEqual(String expected, String actual) {
        Assert.assertEquals(expected,actual);
    }

    public boolean compareFalse(boolean conditionF) {
        Assert.assertFalse(conditionF);
        return false;
    }

    public boolean compareTrue(boolean conditionT) {
        Assert.assertTrue(conditionT);
        return true;
    }

    public String getTextValue(WebElementFacade elementFacade){
        return elementFacade.getText();
    }

}