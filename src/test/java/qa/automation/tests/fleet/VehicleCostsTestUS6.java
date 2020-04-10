package qa.automation.tests.fleet;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.VehicleCostsPageUS6;
import qa.automation.tests.AbstractTestBase;

public class VehicleCostsTestUS6 extends AbstractTestBase {

    @DataProvider(name = "user")
    public Object[] user() {
        return new Object[]{"salesmanager1", "salesmanager2", "salesmanager3", "storemanager1", "storemanager2"};
    }

    @Test(dataProvider = "user", description = "AC1: Verify that the store manager or sales manager should be able" +
            " to see all the car's cost information on the Vehicle Costs page")
    public void verifyTitle(String AuthorizedUser) {
        test = report.createTest("Verify that Authorized user can see cars' cost ");

        LoginPage loginPage = new LoginPage();
        VehicleCostsPageUS6 vehicleCostsPageUS8 = new VehicleCostsPageUS6();

        loginPage.login(AuthorizedUser);
        vehicleCostsPageUS8.navigateTo("Fleet","Vehicle Costs");

        test.pass("All the car's cost information verified");
    }
}
