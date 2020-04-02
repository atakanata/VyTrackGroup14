package qa.automation.tests.fleet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.pages.VehiclesTruckDriverPage;
import qa.automation.tests.AbstactTestBase;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class VehicleTruckDriverPageTest extends AbstactTestBase {

    @Test (description = "US1 - AC1")
    public void verifySeeVehicleInfo(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        VehiclesTruckDriverPage vehiclesTruckDriverPage = new VehiclesTruckDriverPage();
        vehiclesTruckDriverPage.navigateTo("Fleet", "Vehicles");
        Assert.assertEquals(vehiclesTruckDriverPage.getCarsHeaderText(),"Cars");

        List<String> expectedTableHeaders = Arrays.asList("LICENSE PLATE","TAGS","DRIVER","LOCATION","CHASSIS NUMBER"
                ,"MODEL YEAR","LAST ODOMETER","IMMATRICULATION DATE","FIRST CONTRACT DATE","CVVI"
                ,"SEATS NUMBER","DOORS NUMBER","COLOR","TRANSMISSION","FUEL TYPE","CO2 EMISSIONS","HORSEPOWER"
                ,"HORSEPOWER TAXATION","POWER (KW)");

        List<WebElement> actualElements = vehiclesTruckDriverPage.getTableHeaders();
        List<String> actualTableHeaders = new ArrayList<>();

        for (WebElement actualElement : actualElements) {
            actualTableHeaders.add(actualElement.getText());
        }

        Assert.assertEquals(actualTableHeaders,expectedTableHeaders);

    }

    @Test (description = "US1 - AC2")
    public void verifySeeGeneralInfoAfterClick(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        VehiclesTruckDriverPage vehiclesTruckDriverPage = new VehiclesTruckDriverPage();
        vehiclesTruckDriverPage.navigateTo("Fleet", "Vehicles");
        Assert.assertEquals(vehiclesTruckDriverPage.getCarsHeaderText(),"Cars");

        Random a = new Random();
        int index = a.nextInt(26);
        vehiclesTruckDriverPage.getAnywhereInTheTableBody().get(index).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(vehiclesTruckDriverPage.getGeneralInformationText().isDisplayed());

        List<String> expectedGeneralInformationTags = Arrays.asList("License Plate","Tags","Driver","Location","Chassis Number"
                ,"Model Year","Last Odometer","Immatriculation Date","First Contract Date","Catalog Value (VAT Incl.)"
                ,"Seats Number","Doors Number","Color","Transmission","Fuel Type","CO2 Emissions","Horsepower"
                ,"Horsepower Taxation","Power (kW)","Logo","Vehicle Model","Vehicle Make");

        List<WebElement> actualGeneralInformation = vehiclesTruckDriverPage.getGeneralInformationTags();
        List<String> actualGeneralInformationTags = new ArrayList<>();

        for (WebElement actualElement : actualGeneralInformation) {
            actualGeneralInformationTags.add(actualElement.getText());
        }

        Assert.assertEquals(actualGeneralInformationTags,expectedGeneralInformationTags);
    }

    @Test (description = "US1 - AC3")
    public void verifyAddEvent(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("driver1");
        VehiclesTruckDriverPage vehiclesTruckDriverPage = new VehiclesTruckDriverPage();
        vehiclesTruckDriverPage.navigateTo("Fleet", "Vehicles");
        Assert.assertEquals(vehiclesTruckDriverPage.getCarsHeaderText(),"Cars");

        Random a = new Random();
        int index = a.nextInt(26);
        vehiclesTruckDriverPage.getAnywhereInTheTableBody().get(index).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(vehiclesTruckDriverPage.getGeneralInformationText().isDisplayed());

        vehiclesTruckDriverPage.getAddEventButton().click();
        vehiclesTruckDriverPage.getAddEventTitleInput().sendKeys("5 Days Rental");
        BrowserUtils.wait(2);
        vehiclesTruckDriverPage.getAddEventGuestsInput().click();
        BrowserUtils.wait(2);
        List<WebElement> guestsList = vehiclesTruckDriverPage.getAddEventGuestTableBox();
        for (WebElement webElement : guestsList) {
            if(webElement.getText().contains("Nancy Lee")){
                webElement.click();
            }
        }
        BrowserUtils.wait(2);
        Assert.assertEquals(vehiclesTruckDriverPage.getAddEventOwnerSelect().getText().trim(), vehiclesTruckDriverPage.getCurrentUserName().trim());

        vehiclesTruckDriverPage.getAddEventOrganizerNameInput().sendKeys("Enterprise");
        BrowserUtils.wait(2);
        vehiclesTruckDriverPage.getAddEventOrganizerEmailInput().sendKeys("enterprise@cybertekschool.com");
        BrowserUtils.wait(2);

    }
}
