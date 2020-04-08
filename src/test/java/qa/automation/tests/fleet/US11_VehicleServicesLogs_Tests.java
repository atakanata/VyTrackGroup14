package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.US11_VehicleServicesLogsPage;
import qa.automation.tests.AbstractTestBase;
import qa.automation.utilities.Driver;

public class US11_VehicleServicesLogs_Tests extends AbstractTestBase {

    @Test
    public void ac01Test(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        US11_VehicleServicesLogsPage servicesLogsPage = new US11_VehicleServicesLogsPage();
        servicesLogsPage.navigateTo("Fleet", "Vehicle Services Logs");
        Assert.assertEquals(servicesLogsPage.getpageSubtitle(),"VehicleServicesLogs");
    }

    @Test
    public void ac02aTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager1");
        US11_VehicleServicesLogsPage servicesLogsPage = new US11_VehicleServicesLogsPage();
        servicesLogsPage.navigateTo("Fleet", "Vehicle Services Logs");
        Assert.assertNotEquals(Driver.getDriver().getTitle(),"Vehicle Services Logs - Entities - System - Car - Entities - System");
    }

    @Test
    public void ac02bTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("salesmanager1");
        US11_VehicleServicesLogsPage servicesLogsPage = new US11_VehicleServicesLogsPage();
        servicesLogsPage.navigateTo("Fleet", "Vehicle Services Logs");
        Assert.assertNotEquals(Driver.getDriver().getTitle(),"Vehicle Services Logs - Entities - System - Car - Entities - System");
    }

}
