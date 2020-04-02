package qa.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.Driver;

<<<<<<< HEAD
public class AbstractPageBase {

    protected WebDriver driver = Driver.getDriver();

    protected WebDriverWait wait = new WebDriverWait(driver,15);

    @FindBy(css="#user-menu > a")
    protected WebElement currentUser;

=======
/**
 * this class has been copied directly from fall2019Selenium
 * Not been modified deeply, can cause problems
 */
public abstract class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 15);

    @FindBy(css = "#user-menu > a")
    protected WebElement currentUser;

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }


>>>>>>> origin/master
    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }

<<<<<<< HEAD
    public AbstractPageBase(){
        PageFactory.initElements(driver,this);
    }
    public void navigateTo(String tabName, String moduleName){
        String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'"+tabName+"')]";
        String moduleXpath = "//span[@class='title title-level-2' and text()='" + moduleName + "']";

=======

    /**
     * Method for vytrack navigation. Provide tab name and module name to navigate
     * @param tabName, like Dashboards, Fleet or Customers
     * @param moduleName, like Vehicles, Vehicles Odometer and Vehicles Costs
     */
    public void navigateTo(String tabName, String moduleName) {
        String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'" + tabName + "')]";
        String moduleXpath = "//span[@class='title title-level-2' and text()='" + moduleName + "']";
>>>>>>> origin/master

        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));

<<<<<<< HEAD




        Actions actions = new Actions(driver);
        BrowserUtils.wait(4);
=======
        Actions actions = new Actions(driver);

        BrowserUtils.wait(4);

>>>>>>> origin/master
        actions.moveToElement(tabElement).
                pause(2000).
                click(moduleElement).
                build().perform();

<<<<<<< HEAD
        BrowserUtils.wait(4);
    }
}


=======
        //increase this wait time if still failing
        BrowserUtils.wait(4);
    }
}
>>>>>>> origin/master
