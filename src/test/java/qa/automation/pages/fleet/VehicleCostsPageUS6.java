package qa.automation.pages.fleet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.automation.pages.AbstractPageBase;

import java.util.List;

public class VehicleCostsPageUS6 extends AbstractPageBase {

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> allCreatedVehicleCosts;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableHeaders;




}
