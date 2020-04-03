package qa.automation.tests.fleet;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehiclesStoreSalesManagerPage;
import qa.automation.tests.AbstactTestBase;
import qa.automation.utilities.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class VehicleStoreSalesManagerPageTest extends AbstactTestBase {

    /* Verify that Store manager or sales manager should be able to see all vehicle information once
navigate to Vehicle page */

    @Test(description = "US2-AC1")
    public void vehicleInfoDisplayed() {
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


  // AC2 : Verify that Store manager or sales manager should be able to create and cancel car

        vehiclesInfo.getCreateCarButton().click();
        BrowserUtils.wait(3);
        vehiclesInfo.getLicencePlateInputBox().sendKeys("MyTestCar1");
        BrowserUtils.wait(3);
        vehiclesInfo.getFirstTagCheckBox();
        BrowserUtils.wait(3);
        vehiclesInfo.getDriverInputBox().sendKeys("Adam A. Adams");
        BrowserUtils.wait(3);
        vehiclesInfo.getLocationInputBox().sendKeys("Georgia");
        BrowserUtils.wait(3);
        vehiclesInfo.getModelYearInputBox().sendKeys("2015");
        BrowserUtils.wait(3);
        vehiclesInfo.clickSaveAndCloseButton();
        BrowserUtils.wait(3);
        System.out.println(vehiclesInfo.getEntitySavedMessage());
        BrowserUtils.wait(3);
        Assert.assertEquals(vehiclesInfo.getEntitySavedMessage(),"Entity saved");


    }



//***************************************************************************************************************
/*
3.Verify that Store manager or sales manager should be able to add Vehicle Module and Vehicle Make*/



}
