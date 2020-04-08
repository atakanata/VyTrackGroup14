package qa.automation.tests.fleet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleAddEventButtonPage;
import qa.automation.pages.VehiclesPage;

import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.Driver;

public class VehicleAddEventButtonTest extends AbstractTestBase {

    @Test
    public void addEventTest(){
        LoginPage loginPage=new LoginPage();
        VehiclesPage vehiclesPage=new VehiclesPage();
        VehicleAddEventButtonPage vehicleAddEventButtonPage=new VehicleAddEventButtonPage();
        loginPage.login("user39", "UserUser123");
        vehiclesPage.navigateTo("Fleet", "Vehicles");
        vehicleAddEventButtonPage.clickOnAnyElement();
        vehicleAddEventButtonPage.addeventButton();
        BrowserUtils.wait(3);

    }
}
