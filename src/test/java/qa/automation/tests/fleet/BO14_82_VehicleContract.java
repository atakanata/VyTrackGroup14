package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.VehicleContractsPage;
import qa.automation.tests.AbstractTestBase;

public class BO14_82_VehicleContract extends AbstractTestBase {

    LoginPage login = new LoginPage();


    @Test(description = "Verify that authorized user should not be able to access Vehicle Contract " +
                        "(Note: authorized users; store manager, sales manager)")
    public void us7_test1(){
        login.login("storemanager77","UserUser123");

        VehicleContractsPage vehicleContractsPage= new VehicleContractsPage();
        vehicleContractsPage.navigateTo("Fleet","Vehicle Contracts");

        Assert.assertEquals(vehicleContractsPage.getAllVehiclesContractsHeader().trim(),"All Vehicle Contract");
        Assert.assertTrue(vehicleContractsPage.createContract.isDisplayed());
    }

    @Test(description = "Verify that unauthorized user shouldn't be able to access Vehicle Contract." +
                        "(Note: Unauthorized user; Truck driver)")
    public void us7_test2(){

        login.login("driver1");

        VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();
        vehicleContractsPage.navigateTo("Fleet","Vehicle Contracts");

        Assert.assertEquals(vehicleContractsPage.permissionWarning.getText(),"You do not have permission to perform this action.");

    }


}
