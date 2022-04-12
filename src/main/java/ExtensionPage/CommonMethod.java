package ExtensionPage;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.File;

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

    public boolean checkSelected(WebElement element){
        return element.isSelected();
    }

    public boolean checkIsDisplay(WebElement element) {
        return element.isDisplayed();
    }

    public void checkIsEnable(WebElement element){
        element.isEnabled();
    }

    public String getAttribute( WebElement element, String value){
      return element.getAttribute(value);
    }

    //note
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

    public String getTextValue(WebElement element){
        return element.getText();
    }

    public String getFile(){
        return new File("files/photo-1541963463532-d68292c34b19.jpeg").getAbsolutePath();
    }

    public void scrollDown(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
    public void scrollUp(){
        ((JavascriptExecutor)
                getDriver()).executeScript("window.scrollTo(0, document.body.scrollTop);");
    }

}