package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleOdometerTruckDriverPage;
import qa.automation.pages.VehiclesTruckDriverPage;
import qa.automation.tests.AbstactTestBase;
import qa.automation.utilities.BrowserUtils;

public class US3_AC1_Test extends AbstactTestBase {

    @Test(description = "US3-AC1-AC2")
    public void driverSeeVehicleOdometerInfo(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver2");

        VehicleOdometerTruckDriverPage truckDriver= new VehicleOdometerTruckDriverPage();
        truckDriver.navigateTo("Fleet","Vehicle Odometer");
       // BrowserUtils.wait(4);

        Assert.assertTrue(truckDriver.getAllHeaderInfo().isDisplayed());
        System.out.println(truckDriver.getAllHeaderInfo().getText());

        //AC-2 part starts here

        BrowserUtils.wait(3);
        truckDriver.clickCreateVehicleOdometerButton();

        truckDriver.getOdometerValueBox().sendKeys("52000");

        truckDriver.getDriverBox().sendKeys("Adam A. Adams");


        //cancel
        truckDriver.clickCancelButton();
        BrowserUtils.wait(2);

        System.out.println(truckDriver.getSubtitleOfVehiclesOdometer());
        Assert.assertEquals(truckDriver.getSubtitleOfVehiclesOdometer(),"Vehicles Odometers");

        //save and close
        BrowserUtils.wait(3);
        truckDriver.clickCreateVehicleOdometerButton();
        BrowserUtils.wait(3);

        truckDriver.getOdometerValueBox().sendKeys("72000");
        BrowserUtils.wait(3);

        truckDriver.getDriverBox().sendKeys("Adam A. Adams");
        BrowserUtils.wait(1);

        truckDriver.clickSaveAndCloseButton();
      //System.out.println(truckDriver.getSavedMessage().getText());//this line is extra

       Assert.assertTrue(truckDriver.getSavedMessage().isDisplayed());



    }

}
