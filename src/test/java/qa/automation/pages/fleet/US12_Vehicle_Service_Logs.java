package qa.automation.pages.fleet;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.automation.pages.AbstractPageBase;
import qa.automation.utilities.BrowserUtils;

import java.util.List;
import java.util.Random;

public class US12_Vehicle_Service_Logs extends AbstractPageBase {
    private WebDriver driver;


    @FindBy(xpath = "//td[@data-column-label=\"Service Type\"]")
    private List<WebElement> serviceType;
    @FindBy(css = "a[title=\"Edit Vehicle Services Logs\"]")
    private WebElement editBtn;
    @FindBy(css = "[class=\"btn btn-success action-button\"]")
    private WebElement saveAndCloseBtn;
    @FindBy(css = "[class=\"flash-messages-holder\"]")
    private WebElement savedMessage;
    @FindBy(css = "a[title=\"Delete Vehicle Services Logs\"]")
    private WebElement deleteBttn ;
    @FindBy(css = "[class=\"btn ok btn-danger\"]")
    private WebElement yes_delete_btn;
    @FindBy(css = "[class=\"flash-messages-holder\"]")
    private WebElement popUpMessage;

    public US12_Vehicle_Service_Logs() {
    }

    public void clickEditBtn(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(editBtn)).click();
    }
    public void clickSaveAndClose(){
        BrowserUtils.wait(3);
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndCloseBtn)).click();
    }
    public void clickAModelRandomly(){
        Random random=new Random();
        int indexOfModel = random.nextInt(serviceType.size());
        serviceType.get(indexOfModel).click();
    }
    public String  readPopUpMessage(){
        wait.until(ExpectedConditions.visibilityOf(popUpMessage));
        return popUpMessage.getText();
    }
    public void clickDeleteBtn (){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(deleteBttn)).click();
    }
    public void click_Yes_DeleteBtn(){
        BrowserUtils.wait(3);
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(yes_delete_btn)).click();
    }
}

