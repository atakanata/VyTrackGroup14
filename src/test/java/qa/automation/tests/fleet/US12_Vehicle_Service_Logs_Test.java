package qa.automation.tests.fleet;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.fleet.US12_Vehicle_Service_Logs;
import qa.automation.tests.AbstractTestBase;

public class US12_Vehicle_Service_Logs_Test extends AbstractTestBase {
    private WebDriver driver;

    @Test
    public void editTest() {
        LoginPage loginpage = new LoginPage();
        US12_Vehicle_Service_Logs vehicle_service_logs = new US12_Vehicle_Service_Logs();

        loginpage.login("user40","UserUser123");

        vehicle_service_logs.navigateTo("Fleet", "Vehicle Services Logs");
        vehicle_service_logs.clickAModelRandomly();
        vehicle_service_logs.clickEditBtn();
        vehicle_service_logs.clickSaveAndClose();

        String actualMessage = vehicle_service_logs.readPopUpMessage();
        String expected = "Entity saved";
        Assert.assertTrue(actualMessage.contains(expected));
    }


    @Test
    public void deleteTest() {
        LoginPage loginpage = new LoginPage();
        US12_Vehicle_Service_Logs vehicle_service_logs = new US12_Vehicle_Service_Logs();

        loginpage.login("user40","UserUser123");

        vehicle_service_logs.navigateTo("Fleet", "Vehicle Services Logs");

        vehicle_service_logs.clickAModelRandomly();
        vehicle_service_logs.clickDeleteBtn();
        vehicle_service_logs.click_Yes_DeleteBtn();

        String actualMessage = vehicle_service_logs.readPopUpMessage();
        String expected = "Vehicle Services Logs deleted";
        Assert.assertTrue(actualMessage.contains(expected));


    }
}