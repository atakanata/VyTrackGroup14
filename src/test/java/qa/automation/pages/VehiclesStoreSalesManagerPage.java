package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesStoreSalesManagerPage extends AbstractPageBase{

    @FindBy(className= "grid-header-row")
    public WebElement allVehiclesHeader;

    public String getAllVehiclesHeaderInfo(){
        return allVehiclesHeader.getText();
    }


}
