package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends AbstractPageBase {

    @FindBy (className = "oro-subtitle")
    public WebElement carsHeader;

    public String getCarsHeaderText(){
        return carsHeader.getText();
    }
}
