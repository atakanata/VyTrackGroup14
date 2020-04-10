package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleOdometerTruckDriverPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;
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

    @Test(dataProvider = "odometerValues",description = "Verify that, truck driver should be able to delete or edit Vehicle odometer.")
    public void odometerCreationAndEditingAsATruckDriver(String odometerValue){
        LoginPage login = new LoginPage();
        login.login("driver2");
        VehicleOdometerTruckDriverPage vehicleOdometer = new VehicleOdometerTruckDriverPage();
        vehicleOdometer.navigateTo("Fleet","Vehicle Odometer");
        vehicleOdometer.clickCreateVehicleOdometerButton();
        vehicleOdometer.getOdometerValueBox().sendKeys(odometerValue);
        vehicleOdometer.clickSaveAndCloseButton();
        String entitySaved=vehicleOdometer.getSavedMessage().getText();
        Assert.assertTrue(entitySaved.contains("Entity saved"));
        BrowserUtils.wait(2);
        vehicleOdometer.clickEditButton();
        vehicleOdometer.getOdometerValueBox().clear();
        vehicleOdometer.getOdometerValueBox().sendKeys("19500");
        vehicleOdometer.clickSaveAndCloseButton();
        BrowserUtils.wait(2);
        Assert.assertEquals(vehicleOdometer.getSavedOdometerValue(),"19500");

    }
    @DataProvider
    public Object[] odometerValues(){
        return new Object[]{"19400"};
    }
}
