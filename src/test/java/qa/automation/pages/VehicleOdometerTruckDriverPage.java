package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.automation.utilities.BrowserUtils;

public class VehicleOdometerTruckDriverPage extends AbstractPageBase {

    // @FindBy(className = "grid-header-row")
    @FindBy(xpath = "(//tr[@class='grid-header-row'])[1]")
    private WebElement allHeaderInfo;

    public WebElement getAllHeaderInfo() {
        BrowserUtils.waitForPageToLoad(10);
        return allHeaderInfo;
    }

    //***************************************************************************************
    @FindBy(xpath = "//a[@title='Create Vehicle Odometer']")
    private WebElement createVehicleOdometerButton;

    public void clickCreateVehicleOdometerButton() {
        BrowserUtils.waitForPageToLoad(10);
        createVehicleOdometerButton.click();
    }

    //***************************************************************************************
     @FindBy(name = "custom_entity_type[OdometerValue]")
 //   @FindBy(xpath = "//input[@data-name='field__odometer-value']")
    private WebElement odometerValueBox;

    public WebElement getOdometerValueBox() {
        BrowserUtils.wait(1);
        return odometerValueBox;
    }

    //***************************************************************************************
    @FindBy(name = "custom_entity_type[Driver]")
    private WebElement driverBox;

    public WebElement getDriverBox() {
        BrowserUtils.wait(1);
        return driverBox;
    }

    //***************************************************************************************

    @FindBy(xpath = "//a[@title='Cancel']")
    private WebElement cancelButton;

    public void clickCancelButton() {
        cancelButton.click();
    }

    //***************************************************************************************

    @FindBy(className = "oro-subtitle")
    private WebElement subtitleOfVehiclesOdometer;

    public String getSubtitleOfVehiclesOdometer() {
        return subtitleOfVehiclesOdometer.getText();
    }
//***************************************************************************************

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveAndCloseButton;

    public void clickSaveAndCloseButton(){
        BrowserUtils.waitForPageToLoad(10);
        BrowserUtils.wait(3);
        saveAndCloseButton.click();
    }

    //***************************************************************************************

   @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div")
    public WebElement entitySavedMessage;

    public WebElement getSavedMessage(){
        wait.until(ExpectedConditions.visibilityOf(entitySavedMessage));
        return entitySavedMessage;
    }


}
