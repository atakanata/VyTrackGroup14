package qa.automation.pages.fleet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.automation.pages.AbstractPageBase;

import java.util.List;

public class VehicleCostsPageUS6 extends AbstractPageBase {

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> allCreatedVehicleCosts;

    @FindBy(xpath = "//*[contains(@class,'cell grid-cell grid-body-cell grid-body-cell')]")
    public List<WebElement> allCreatedVehicleCostsInfo;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement subTitle;

    @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> tableHeaders;

    @FindBy(xpath = "//*[text()='Manage filters']")
    public WebElement manageFilterDropDown;

    @FindBy(xpath = "//*[@title='Create Vehicle Costs']")
    public WebElement createVehicleCost;

    @FindBy(css ="[class='fa-repeat']")
    public WebElement refreshBtn;

    @FindBy(css = "[class='btn-group open']")
    public WebElement viewPageDropDown;

    @FindBy(css ="[class='fa-refresh']")
    public WebElement resetBtn;

    @FindBy(css ="[class='fa-cog hide-text']")
    public WebElement gridSettingsBtn;


    public List<WebElement> getAllCreatedVehicleCosts(){
        return allCreatedVehicleCosts;
    }

    public List<WebElement> getTableHeaders(){
        return tableHeaders;
    }

    public WebElement getSubTitle(){
        return subTitle;
    }

    public WebElement getManageFilterDropDown(){
        return manageFilterDropDown;
    }

    public WebElement getCreateVehicleCost(){
        return createVehicleCost;
    }

    public WebElement getRefreshBtn(){
        return refreshBtn;
    }

    public WebElement getViewPageDropDown(){
        return viewPageDropDown;
    }

    public WebElement getResetBtn(){
        return resetBtn;
    }

    public WebElement getGridSettingsBtn() {
        return gridSettingsBtn;
    }
        public List<WebElement> getAllCreatedVehicleCostsInfo(){
            return allCreatedVehicleCostsInfo;
    }
    }