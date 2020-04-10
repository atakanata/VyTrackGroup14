package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehiclesPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.Driver;

public class VerifyVehiclePageTitleTest extends AbstractTestBase {
    @Test
    public void VerifyVehiclePages() {
        LoginPage loginPage=new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();
        loginPage.login("store_manager");
        vehiclesPage.navigateTo("Fleet", "Vehicles");
        String expectedTitle = "All - Vehicles Model - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}