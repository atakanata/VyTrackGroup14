package qa.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.automation.pages.activities.CalendarEventsPage;
import qa.automation.utilities.Driver;

/**
 * this class for home page and contains navigating around the homepage elements
 */
public class HomePage {
    private WebDriver driver= Driver.getDriver();

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[4]")
    protected WebElement activitiesDropDownHover;

    @FindBy(xpath = "//span[contains(text(),'Calendar Events')]")
    protected WebElement calendarEventsLink;

    public CalendarEventsPage navigateToCalendarEventsPageFromHomePage(){
        Actions actions=new Actions(driver);
        actions.moveToElement(activitiesDropDownHover).moveToElement(calendarEventsLink).click().perform();
        return new CalendarEventsPage();
    }

}
