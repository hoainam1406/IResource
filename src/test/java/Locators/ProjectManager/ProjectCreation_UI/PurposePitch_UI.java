package Locators.ProjectManager.ProjectCreation_UI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PurposePitch_UI extends PageObject {
    @FindBy (className = "btn-upload-image")
    public WebElementFacade btnUploadThumbnail;

//    @FindBy(className = "upload-image-review mb-3 mb-lg-0")
//    public WebElementFacade
    @FindBy (css = "input[name='img']")
    public WebElementFacade idThumbnail;

    @FindBy (css = "#projectName+.errors")
    public WebElementFacade errProjectName;

    @FindBy (css = "div[class='mb-4 group-radio'] p[class='errors']")
    public WebElementFacade errStatus;

    @FindBy (css = "button[type='submit']")
    public WebElementFacade btnFinish;

    @FindBy (id = "projectName")
    public WebElementFacade tbxProjectName;

    @FindBy (css = "input[value='PUBLIC']")
    public WebElementFacade rbnPublic;

    @FindBy (css = "input[value='CONFIDENTIAL']")
    public WebElementFacade rbnConfidential;

    @FindBy (name = "startAt")
    public WebElementFacade tbxStartDate;

    @FindBy (name = "endAt")
    public WebElementFacade tbxEndDate;

    @FindBy (className = "react-datepicker__month-container")
    public WebElementFacade datePicker;

    @FindBy (css = "div[aria-label='Choose Friday, April 8th, 2022']")
    public WebElementFacade startDate;

    @FindBy (css = "div[aria-label='Choose Saturday, March 26th, 2022']")
    public WebElementFacade endDate;

    @FindBy (css = "button[aria-label='Previous Month']")
    public WebElementFacade previousMonth;

    @FindBy (css= ".date-picker-calendar+.errors")
    public WebElementFacade errEndDate;



}

