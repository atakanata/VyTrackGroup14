package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleContractsPage extends AbstractPageBase {

    @FindBy(css = ".oro-subtitle")
    public WebElement tableHeader;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createContract;

    // unauthorized users get this alert message
    @FindBy (xpath = "//*[@id='flash-messages']//div[contains(text(),'permission')]")
    public WebElement permissionWarning;

    public String getAllVehiclesContractsHeader(){
        return tableHeader.getText();
    }
}
