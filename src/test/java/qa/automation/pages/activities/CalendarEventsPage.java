package qa.automation.pages.activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.automation.pages.AbstractPageBase;
import qa.automation.utilities.Driver;

public class CalendarEventsPage extends AbstractPageBase {
    private WebDriver driver= Driver.getDriver();
    public CalendarEventsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@title='Create Calendar event']")
    private WebElement createCalendarEventButton;

    public CreateCalendarEventPage clickCreateCalendarEventPage(){
        createCalendarEventButton.click();
        return new CreateCalendarEventPage();
    }

}
