package qa.automation.tests.fleet;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.Driver;

public class VehicleFuelLog extends AbstractTestBase {

    LoginPage login = new LoginPage();
    private By fleetModule = By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet')]");
    private By subModules = By.cssSelector("dropdown-menu-title dropdown-menu-title-level-2");
    private By subTitle = By.cssSelector("h1[class='oro-subtitle']");


    @Test
    public void vehiclesFuelLogsPage(){

        login.login("user40", "UserUser123");
        actions.moveToElement(Driver.getDriver().findElement(fleetModule)).perform();
        BrowserUtils.wait(2);
        Driver.getDriver().findElement(By.linkText("Vehicles Fuel Logs")).click();

        BrowserUtils.wait(2);

        String expected = "Vehicle Fuel Logs";
        String actual = Driver.getDriver().findElement(subTitle).getText().trim();
        Assert.assertEquals(expected,actual);

    }



    }

