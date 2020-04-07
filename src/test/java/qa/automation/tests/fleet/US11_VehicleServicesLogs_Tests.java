package qa.automation.tests.fleet;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.US11_VehicleServicesLogsPage;
import qa.automation.tests.AbstractTestBase;

public class US11_VehicleServicesLogs_Tests extends AbstractTestBase {



    @Test
    public void ac01Test(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        US11_VehicleServicesLogsPage servicesLogsPage = new US11_VehicleServicesLogsPage();
        servicesLogsPage.navigateTo("Fleet", "Vehicle Services Logs");
        Assert.assertEquals(servicesLogsPage.getpageSubtitle(),"VehicleServicesLogs");
    }
}
