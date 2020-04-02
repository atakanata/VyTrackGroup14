package qa.automation.tests.fleet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qa.automation.pages.LoginPage;
import qa.automation.tests.AbstactTestBase;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.Driver;

import java.util.List;

public class Us14_Ac1_Test extends AbstactTestBase {

  LoginPage login = new LoginPage();
  private By fleetModule = By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet')]");
  private By subModules = By.cssSelector("dropdown-menu-title dropdown-menu-title-level-1");
  private By subTitle = By.cssSelector("h1[class='oro-subtitle']");
  @Test
  public void vehicleModelPage(){

      login.login("storemanager77", "UserUser123");
      actions.moveToElement(Driver.getDriver().findElement(fleetModule)).perform();
      BrowserUtils.wait(2);
      Driver.getDriver().findElement(By.linkText("Vehicles Model")).click();

      BrowserUtils.wait(2);

      String expected = "All Vehicles Model";
      String actual = Driver.getDriver().findElement(subTitle).getText().trim();

      Assert.assertEquals(expected,actual);

  }
}
