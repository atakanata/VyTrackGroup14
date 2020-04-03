package qa.automation.tests.fleet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehiclesStoreSalesManagerPage;
import qa.automation.tests.AbstactTestBase;

import java.util.Arrays;
import java.util.List;

public class VehicleStoreSalesManagerPageTest extends AbstactTestBase {


    @Test(description = "US2-AC1")
    public void vehicleInfoDisplayed() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager1");
        VehiclesStoreSalesManagerPage vehiclesInfo = new VehiclesStoreSalesManagerPage();
        vehiclesInfo.navigateTo("Fleet", "Vehicles");

       System.out.println(vehiclesInfo.getAllVehiclesHeaderInfo()); // this line is extra

        String expectedAllVehicleInfo = "LICENSE PLATE\n" +
                "TAGS\n" + "DRIVER\n" + "LOCATION\n" + "CHASSIS NUMBER\n" + "MODEL YEAR\n" +
                "LAST ODOMETER\n" + "IMMATRICULATION DATE\n" + "FIRST CONTRACT DATE\n" + "CVVI\n" +
                "SEATS NUMBER\n" + "DOORS NUMBER\n" + "COLOR\n" + "TRANSMISSION\n" + "FUEL TYPE\n" +
                "CO2 EMISSIONS\n" + "HORSEPOWER\n" + "HORSEPOWER TAXATION\n" + "POWER (KW)";

        Assert.assertEquals(vehiclesInfo.getAllVehiclesHeaderInfo(), expectedAllVehicleInfo);

    }



//***************************************************************************************************************



}
