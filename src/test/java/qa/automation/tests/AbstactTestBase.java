package qa.automation.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import qa.automation.utilities.BrowserUtils;
import qa.automation.utilities.ConfigurationReader;
import qa.automation.utilities.Driver;

import java.io.IOException;

public abstract class AbstactTestBase {

    protected WebDriverWait wait;
    protected Actions actions;
    protected ExtentReports report;
    protected ExtentHtmlReporter  htmlReporter;
    protected ExtentTest test;

    @BeforeTest
    public void setupTest(){
        report = new ExtentReports();
        String reportPath = "";
        if(System.getProperty("os.name").toLowerCase().contains("win")){
            reportPath = System.getProperty("user.dir") + "\\test-output\\report.html";
        }else{
            reportPath = System.getProperty("user.dir") + "/test-output/report.html";
        }

        htmlReporter = new ExtentHtmlReporter(reportPath);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("VYTRACK Test Automation Results");
    }

    @AfterTest
    public void afterTest(){
        report.flush();
    }

    @BeforeMethod
    public void setup(){

        String URL = ConfigurationReader.getProperty("qa2");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(),10);
        actions = new Actions(Driver.getDriver());
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws IOException {

        if(iTestResult.getStatus() == ITestResult.FAILURE){
            String screenShotPath = BrowserUtils.getScreenShot(iTestResult.getName());
            test.fail(iTestResult.getName());
            BrowserUtils.wait(6);
            test.addScreenCaptureFromPath(screenShotPath,"Failed");
            test.fail(iTestResult.getThrowable());
        }

        Driver.closeDriver();
    }

}
