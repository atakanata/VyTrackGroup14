package qa.automation.tests.fleet;


import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.VehiclesStoreSalesManagerPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.BrowserUtils;

public class VehicleStoreSalesManagerPageTest extends AbstractTestBase {

    /*US2-AC1 Verify that Store manager or sales manager should be able to see all vehicle information once
navigate to Vehicle page */

    @Test(description = "US2-AC1-AC2")
    public void createVehicleSaveOrCancel() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager1");
        VehiclesStoreSalesManagerPage vehiclesInfo = new VehiclesStoreSalesManagerPage();
        vehiclesInfo.navigateTo("Fleet", "Vehicles");

       System.out.println(vehiclesInfo.getAllVehiclesHeaderInfo().getText()); // this line is extra

       String expectedAllVehicleInfo = "LICENSE PLATE\n" +
                "TAGS\n" + "DRIVER\n" + "LOCATION\n" + "CHASSIS NUMBER\n" + "MODEL YEAR\n" +
                "LAST ODOMETER\n" + "IMMATRICULATION DATE\n" + "FIRST CONTRACT DATE\n" + "CVVI\n" +
                "SEATS NUMBER\n" + "DOORS NUMBER\n" + "COLOR\n" + "TRANSMISSION\n" + "FUEL TYPE\n" +
                "CO2 EMISSIONS\n" + "HORSEPOWER\n" + "HORSEPOWER TAXATION\n" + "POWER (KW)";

        Assert.assertEquals(vehiclesInfo.getAllVehiclesHeaderInfo().getText(), expectedAllVehicleInfo);

  // US2-AC2 : Verify that Store manager or sales manager should be able to create and cancel car

        vehiclesInfo.getCreateCarButton().click();
        BrowserUtils.wait(3);
        vehiclesInfo.getLicencePlateInputBox().sendKeys("MyTestCar1");
        BrowserUtils.wait(2);
        vehiclesInfo.getFirstTagCheckBox();
        BrowserUtils.wait(2);
        vehiclesInfo.getDriverInputBox().sendKeys("Adam A. Adams");
        BrowserUtils.wait(2);
        vehiclesInfo.getLocationInputBox().sendKeys("Georgia");
        BrowserUtils.wait(3);
        vehiclesInfo.getModelYearInputBox().sendKeys("2015");
        BrowserUtils.wait(3);
        // from this point we can cancel or save
        //part to ceheck to save
        vehiclesInfo.clickSaveAndCloseButton();
        BrowserUtils.wait(3);
        Assert.assertEquals(vehiclesInfo.getEntitySavedMessage(),"Entity saved");

        //this part is to check to cancel
//        vehiclesInfo.cancelButton().click();
//        BrowserUtils.wait(2);


    }



}
