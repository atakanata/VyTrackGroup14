package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesStoreSalesManagerPage extends AbstractPageBase{

    @FindBy(className= "grid-header-row")
    public WebElement allVehiclesHeader;

    public WebElement getAllVehiclesHeaderInfo(){
        return allVehiclesHeader;
    }

//*****************************************************************************************************

 //   @FindBy(className = "btn main-group btn-primary pull-right")
     @FindBy(partialLinkText = "Create Car")
    public WebElement createCar;

    public WebElement getCreateCarButton(){
        return createCar;
    }
//*****************************************************************************************************

   @FindBy(xpath = "//input[contains(@id,'custom_entity_type_LicensePlate-uid')]")
    public WebElement licencePlateInputBox;

    public WebElement getLicencePlateInputBox(){
        return licencePlateInputBox;
    }
//*****************************************************************************************************
//
    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Tags_0-uid')]")
    public WebElement tagsJuniorcheckBox;

    public void getFirstTagCheckBox(){
        tagsJuniorcheckBox.click();
    }

//*****************************************************************************************************

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Driver-uid')]")
    public WebElement driverInputBox;

    public WebElement getDriverInputBox(){
        return driverInputBox;
    }

 //*****************************************************************************************************
    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Location-uid')]")
    public WebElement locationInputBox;

    public WebElement getLocationInputBox(){
        return locationInputBox;
    }

 //*****************************************************************************************************

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_ModelYear-uid')]")
    public WebElement modelYearInputBox;

    public WebElement getModelYearInputBox(){
        return modelYearInputBox;
    }
//*****************************************************************************************************
    @FindBy(css = ".btn.btn-success.action-button")
    public WebElement saveAndCloseButton;

    public void clickSaveAndCloseButton(){
         saveAndCloseButton.click();
    }

//*****************************************************************************************************

    @FindBy(xpath = "//div[contains(text(),'saved')]")
    public WebElement entitySavedMessage;

    public String getEntitySavedMessage(){
        return entitySavedMessage.getText();
    }
//*****************************************************************************************************

}
