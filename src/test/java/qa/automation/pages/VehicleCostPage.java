package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCostPage extends AbstractPageBase {

    @FindBy (xpath = "//a[@title='Create Vehicle Costs']")
    protected WebElement vehicleCostButton;

    public void createVehicleCost(){
       vehicleCostButton.click();

    }

}
