package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehiclesPage;

public class VehiclePageTest extends AbstractTestBase {

    @Test
    public void seeVehicleInfo(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.navigateTo("Fleet", "Vehicles");
        Assert.assertEquals(vehiclesPage.getCarsHeaderText(),"Cars");
    }
}
