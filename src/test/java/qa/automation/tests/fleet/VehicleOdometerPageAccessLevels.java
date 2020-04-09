package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleOdometerTruckDriverPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.Driver;

public class VehicleOdometerPageAccessLevels extends AbstractTestBase {

    @Test(description="Truck driver can access to the page")
    public void verifyTruckDriver(){
        LoginPage login = new LoginPage();
        login.login("driver2");
        VehicleOdometerTruckDriverPage vehicleOdometer = new VehicleOdometerTruckDriverPage();
        vehicleOdometer.navigateTo("Fleet","Vehicle Odometer");
        Assert.assertEquals(vehicleOdometer.getSubtitleOfVehiclesOdometer(),"Vehicles Odometers");
    }

    @Test(dataProvider="managerCredentials")
    public void verifyManagers(String user){
        LoginPage login = new LoginPage();
        login.login(user);
        VehicleOdometerTruckDriverPage vehicleOdometer = new VehicleOdometerTruckDriverPage();
        vehicleOdometer.navigateTo("Fleet", "Vehicle Odometer");
        Assert.assertTrue(vehicleOdometer.getAccessDeniedMessage().isDisplayed());
        Assert.assertEquals(vehicleOdometer.getMenuHeader().getText(),"Dashboard");
    }

    @DataProvider
    public Object[] managerCredentials(){
        return new Object[]{"salesmanager1", "storemanager2"};
    }
}
