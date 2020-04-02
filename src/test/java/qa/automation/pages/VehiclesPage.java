package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class VehiclesPage extends AbstractPageBase {

    @FindBy (className = "oro-subtitle")
    public WebElement carsHeader;

    @FindBy (xpath = "//thead[@class='grid-header']/tr/th//span[@class='grid-header-cell__label']")
    public List<WebElement> tableHeaders;

    @FindBy (xpath = "//ul[@class='icons-holder']/li[3]/a")
    public WebElement pageForwardArrow;

    @FindBy (className = "fa-cog hide-text")
    public WebElement gridSettingsButton;

    @FindBy (xpath = "//tr[@class='renderable']/td[3]/input")
    public WebElement gridSettingInputButtons;

    @FindBy (xpath = "span[class='close']")
    public WebElement closeGridSettingsButton;

    @FindBy (xpath = "//div[contains(@class,'actions-panel pull-right')]/div/a[3]")
    public WebElement resetButton;

    @FindBy (xpath = "//tbody[@class='grid-body']/tr")
    public List<WebElement> anywhereInTheTableBody;

    @FindBy (xpath = "//h5/span")
    public WebElement generalInformationText;

    @FindBy (xpath = "//label[@class='control-label']")
    public List<WebElement> generalInformationTags;

    @FindBy (xpath = "//div[@class='pull-right title-buttons-container']/div/a")
    public WebElement addEventButton;

    @FindBy (xpath = "//*[contains(@id,'oro_calendar_event_form_title-')]")
    public WebElement addEventTitleInput;

    @FindBy (xpath = "//div[contains(@id,'s2id_oro_calendar_event_form_attendees-')]//input")
    public WebElement addEventGuestsInput;

    @FindBy (xpath = "//a[@class='select2-choice']/span[1]")
    public WebElement addEventOwnerSelect;

    @FindBy (xpath = "//*[contains(@id,'oro_calendar_event_form_organizerDisplayName-')]")
    public WebElement addEventOrganizerNameInput;

    @FindBy (xpath = "//*[contains(@id,'oro_calendar_event_form_organizerEmail-')]")
    public WebElement addEventOrganizerEmailInput;

    public String getCarsHeaderText(){
        return carsHeader.getText();
    }

    public List<WebElement> getTableHeaders(){
        return tableHeaders;
    }

    public WebElement getPageForwardArrow(){
        return pageForwardArrow;
    }

    public WebElement getGridSettingsButton(){
        return gridSettingsButton;
    }

    public WebElement getGridSettingInputButtons(){
        return gridSettingInputButtons;
    }

    public WebElement getCloseGridSettingsButton(){
        return closeGridSettingsButton;
    }

    public WebElement getResetButton(){
        return resetButton;
    }

    public List<WebElement> getAnywhereInTheTableBody(){
        return anywhereInTheTableBody;
    }

    public WebElement getGeneralInformationText(){
        return generalInformationText;
    }

    public List<WebElement> getGeneralInformationTags(){
        return generalInformationTags;
    }

    public WebElement getAddEventButton(){
        return addEventButton;
    }

    public WebElement getAddEventTitleInput(){
        return addEventTitleInput;
    }

    public WebElement getAddEventGuestsInput(){
        return addEventGuestsInput;
    }

    public WebElement getAddEventOwnerSelect(){
        return addEventOwnerSelect;
    }

    public WebElement getAddEventOrganizerNameInput(){
        return addEventOrganizerNameInput;
    }

    public WebElement getAddEventOrganizerEmailInput(){
        return addEventOrganizerEmailInput;
    }
}
