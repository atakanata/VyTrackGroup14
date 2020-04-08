package qa.automation.pages.fleet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import qa.automation.pages.AbstractPageBase;
import qa.automation.utilities.BrowserUtils;

import java.util.List;

public class VehicleContractsPageUS8 extends AbstractPageBase {

    @FindBy(className = "grid-header-cell__label")
    private List<WebElement> columnNames;

    @FindBy(css = "[id='grid-custom-entity-grid-1361993564']")
    private WebElement vehicleContractGrid;

    public List<String> getColumnNames() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("grid-header-cell__label")));
        return BrowserUtils.getTextFromWebElements(columnNames);
    }
    public WebElement getVehicleContractGrid(){
        BrowserUtils.waitForPageToLoad(20);
        return vehicleContractGrid;

    }
}