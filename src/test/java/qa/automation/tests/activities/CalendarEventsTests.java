package qa.automation.tests.activities;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.AbstractPageBase;
import qa.automation.pages.HomePage;
import qa.automation.pages.LoginPage;
import qa.automation.pages.activities.CalendarEventsPage;
import qa.automation.pages.activities.CreateCalendarEventPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.ConfigurationReader;
import qa.automation.utilities.Driver;

public class CalendarEventsTests extends AbstractTestBase {

    @Test
    public void createAnEventAsAStoreManager(){
        LoginPage loginPage=new LoginPage();
        loginPage.login("storemanager2");
        BrowserUtils.waitForPageToLoad(3);
        HomePage homePage=new HomePage();
        CalendarEventsPage calendarEventsPage=homePage.navigateToCalendarEventsPageFromHomePage();
        BrowserUtils.wait(3);
        CreateCalendarEventPage createCalendarEventPage=calendarEventsPage.clickCreateCalendarEventPage();
        BrowserUtils.wait(3);
        createCalendarEventPage.enterTitle("testTitle");
        createCalendarEventPage.clickSaveAndCloseButton();
        BrowserUtils.wait(2);
        String expected="Calendar event saved";
        String result=createCalendarEventPage.getSuccessMessage();
        Assert.assertEquals(result,expected);
    }
}
