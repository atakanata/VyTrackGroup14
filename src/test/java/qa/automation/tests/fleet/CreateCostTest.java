package qa.automation.tests.fleet;

import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleCostPage;
import qa.automation.pages.VehiclesPage;

import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;

public class CreateCostTest extends AbstractTestBase {

    @Test
    public void addEvent(){
        LoginPage loginPage=new LoginPage();
        VehiclesPage vehiclesPage=new VehiclesPage();
        VehicleCostPage vehicleCostPage=new VehicleCostPage();
        loginPage.login("user39", "UserUser123");
        vehiclesPage.navigateTo("Fleet","Vehicle Costs");
        vehicleCostPage.createVehicleCost();
        BrowserUtils.wait(3);


    }
}
