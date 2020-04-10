package qa.automation.pages.fleet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qa.automation.pages.AbstractPageBase;

public class US11_VehicleServicesLogsPage extends AbstractPageBase {

    @FindBy(css = "#container > div.container-fluid.page-title > div > div > div.pull-left.pull-left-extra > div > h1")
    private WebElement oroSubtitle;

    public String getpageSubtitle(){
        return oroSubtitle.getText();
    }
}
