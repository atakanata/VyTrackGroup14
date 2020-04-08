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
    @FindBy(css="a[title*='Cancel']")
    public WebElement cancelButton;

    public WebElement cancelButton(){
   return cancelButton;
    }
//*****************************************************************************************************
    @FindBy(xpath = "//a[contains(@class,'action btn mode-icon-only')]")
    public WebElement filterSymbol;

    public void clickFilterSymbol(){
        filterSymbol.click();
    }
 //"css selector","selector":".action\ btn\ mode\-icon\-only"}
//*****************************************************************************************************
    @FindBy(className = "add-filter-button")
    public WebElement manageFiltersButton;

    public WebElement getManageFiltersButton(){
        return manageFiltersButton;
    }

//*****************************************************************************************************
@FindBy(xpath = "//label[@title='License Plate']")
public WebElement checboxLicencePlateOption;

    public void clickCheckboxLicencePlateOption(){
        checboxLicencePlateOption.click();
    }

//*****************************************************************************************************
    @FindBy(className = "filter-items")
    public WebElement openedLicencePlate;

    public void clickOpenedLicencePlate(){
        openedLicencePlate.click();
    }

//*********************************************************************************************************
    @FindBy(name = "value")
    public WebElement inputBoxForPlate;

    public WebElement getInputBoxForPlate(){
        return inputBoxForPlate;
    }

//*********************************************************************************************************
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary filter-update')]")
    public WebElement updateButton;

    public WebElement getUpdateButton(){
        return updateButton;
    }
//*********************************************************************************************************
@FindBy(xpath = "//tr[1]//td[2]")

    public WebElement firstCheckboxForCreatedCar;

    public void clickFirstCheckboxForCreatedCar(){
       firstCheckboxForCreatedCar.click();
    }
//*********************************************************************************************************

    @FindBy(xpath = "//a[@title='Edit Car']")
    public WebElement editButtonAfterEnteringCreatedCar;

    public void clickEditButtonAfterEnteringCreatedCar(){
        editButtonAfterEnteringCreatedCar.click();
    }

//*********************************************************************************************************
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement addButtonForVehicleModel;

    public void clickAddButtonForVehicleModel(){
        addButtonForVehicleModel.click();
    }
//*********************************************************************************************************
    @FindBy(xpath = "//td[1]")
    public WebElement chooseFirstModelName;

    public void clickChooseFirstModelName(){
        chooseFirstModelName.click();
    }
//*********************************************************************************************************
    @FindBy(xpath = "//button[contains(text(),'Select')]")
    public WebElement selectButton;

    public void select(){
        selectButton.click();
    }

//*********************************************************************************************************
    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement addButtonForVehicleMake;

    public void clickAddButtonForVehicleMake(){
        addButtonForVehicleMake.click();
    }
//*********************************************************************************************************

    @FindBy(xpath = "(//b[contains(text(),'All')])[1]")
  //  @FindBy(css = ".btn.filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value")
    public WebElement chooseAllMake;

    public void clickChooseAllMake(){
        chooseAllMake.click();
    }
//*********************************************************************************************************
@FindBy(name = "value")
public WebElement inputBoxToCheckForMakes;

    public WebElement getInputBoxToCheckForMakes(){
        return inputBoxToCheckForMakes;
    }
//*********************************************************************************************************
    @FindBy(xpath = "//td[1]")
    public WebElement chooseFirstMakeName;

    public void clickChooseFirstMakeName(){
        chooseFirstMakeName.click();

//*********************************************************************************************************


    }
}
