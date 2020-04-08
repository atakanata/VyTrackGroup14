package qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleAddEventButtonPage extends AbstractPageBase {

    @FindBy(xpath = "//table//tbody//tr[2]//td[1]")
    protected WebElement anyElementOnTable;

    @FindBy (xpath = "//a[contains(text(),'Add Event')]")
    protected WebElement addEvent;

    public void clickOnAnyElement(){ anyElementOnTable.click();
    }

    public void addeventButton(){
        addEvent.click();
    }

}
