package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehicleContractsPage;
import qa.automation.tests.AbstactTestBase;

public class VehicleContractsTest extends AbstactTestBase {

    LoginPage login = new LoginPage();


    @Test
    public void us7_test1(){
        login.login("storemanager77","UserUser123");

        VehicleContractsPage vehicleContractsPage= new VehicleContractsPage();
        vehicleContractsPage.navigateTo("Fleet","Vehicle Contracts");

        Assert.assertEquals(vehicleContractsPage.getAllVehiclesContractsHeader().trim(),"All Vehicle Contract");
        Assert.assertTrue(vehicleContractsPage.createContract.isDisplayed());
    }
}
