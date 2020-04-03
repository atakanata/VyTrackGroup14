package qa.automation.pages.activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.automation.pages.AbstractPageBase;
import qa.automation.utilities.Driver;

public class CreateCalendarEventPage extends AbstractPageBase {
    private WebDriver driver= Driver.getDriver();
    public CreateCalendarEventPage(){
        super();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[contains(@id,'oro_calendar_event_form_title')]")
    private WebElement titleInput;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[contains(text(),'Calendar event saved')]")
    private WebElement successMessage;

    public void enterTitle(String s){
        titleInput.sendKeys(s);
    }
    public void clickSaveAndCloseButton(){
        saveAndCloseButton.click();
    }
    public String getSuccessMessage(){
        return successMessage.getText();
    }
}
