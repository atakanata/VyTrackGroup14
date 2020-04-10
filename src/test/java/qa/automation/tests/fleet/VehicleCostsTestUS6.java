package qa.automation.tests.fleet;

import org.openqa.selenium.JavascriptException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.VehicleCostsPageUS6;
import qa.automation.tests.AbstractTestBase;

public class VehicleCostsTestUS6 extends AbstractTestBase {

    @DataProvider(name = "user")
    public Object[] user() {
        return new Object[]{"salesmanager1"};//, "salesmanager2", "salesmanager3", "storemanager1", "storemanager2"
    }

    @Test(dataProvider = "user", description = "AC1: Verify that the store manager or sales manager should be able" +
            " to see all the car's cost information on the Vehicle Costs page")
    public void verifyTitle(String authorizedUser) {
        test = report.createTest("Verify that Authorized user can see cars' cost module ");

        LoginPage loginPage = new LoginPage();
        VehicleCostsPageUS6 vehicleCostsPageUS6 = new VehicleCostsPageUS6();

        test.info("Log in as "+authorizedUser);
        loginPage.login(authorizedUser);

        test.info("Navigate to Fleet tab, Vehicle Costs modul");
        vehicleCostsPageUS6.navigateTo("Fleet","Vehicle Costs");

        test.info("Verify the subtitle");
        String expected = "All Vehicle Costs";
        Assert.assertEquals(vehicleCostsPageUS6.getSubTitle().getText().trim(),expected);
        test.pass("All the car's cost information verified");
    }
}
