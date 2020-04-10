package qa.automation.tests.fleet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.VehicleContractsPageUS8;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.Driver;

import java.util.Arrays;
import java.util.List;

public class VehicleContractsTestUS8 extends AbstractTestBase {



    @Test(description = "AC1: Verify that authorized user should be able to access Vehicle Contract page")
    public void verifyTitle() {
        test = report.createTest("Verify page title");
        LoginPage loginPage = new LoginPage();
        VehicleContractsPageUS8 vehicleContractsPageUS8 = new VehicleContractsPageUS8();
        loginPage.login("salesmanager1");
        vehicleContractsPageUS8.navigateTo("Fleet", "Vehicle Contracts");

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        test.pass("Page title Dashboard was verified");
    }

    @Test(description = "AC1: Verify that authorized user should be able to see all vehicle contracts on the grid.")
    public void verifyVehicleContractsOnTheGrid() {
        test = report.createTest("Verify column names");

        LoginPage loginPage = new LoginPage();
        VehicleContractsPageUS8 vehicleContractsPageUS8 = new VehicleContractsPageUS8();

        loginPage.login("salesmanager1");
        vehicleContractsPageUS8.navigateTo("Fleet", "Vehicle Contracts");

        List<String> expectedColamnNames = Arrays.asList("TYPE", "RESPONSIBLE", "ACTIVATION COST", "RCAD",
                "RECURRING COST AMOUNT","ODOMETER DETAILS", "INOVICE DATE","CONTRACT START DATE", "CONTRACT EXPIRATION DATE",
                "VENDOR", "DRIVER","CONTRACT REFERENCE", "SERVICE", "STATUS");
        System.out.println("actual: "+vehicleContractsPageUS8.getColumnNames()+"expected: "+expectedColamnNames);;
        Assert.assertEquals(vehicleContractsPageUS8.getColumnNames(),expectedColamnNames);
        test.pass("Column names verified");
    }
}