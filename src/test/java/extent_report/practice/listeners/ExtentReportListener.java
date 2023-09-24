package extent_report.practice.listeners;


import base_test.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class ExtentReportListener implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        //Create an html report for the suite that is executed
        BaseTest.report = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("Exx_Results.html");
        extentSparkReporter.config().setReportName("Automation Report");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Automation report name");
        extentSparkReporter.config().setDocumentTitle("set document title");
        BaseTest.report.attachReporter(extentSparkReporter);

//		 logger = report.createTest("test name 01");

    }

    @Override
    public void onFinish(ISuite suite) {
        BaseTest.report.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        BaseTest.logger = BaseTest.report.createTest(result.getMethod().getMethodName());
        BaseTest.logger.log(Status.INFO, "Executing test: " + result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        BaseTest.logger.log(Status.INFO, "Finished executing test");
    }


    @Override
    public void onTestFailure(ITestResult result) {
        String fileName = String.format("Screenshot-%s.jpg", Calendar.getInstance().getTimeInMillis());
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver"); //use string from setAttribute from BasePage
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshots/" + fileName);
        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot taken, saved in screenshots folder");
        } catch (IOException e) {
            System.out.println("Failed to take screenshot");
        }
        BaseTest.logger.log(Status.FAIL, "Test failed, attaching screenshot in screenshots folder");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        BaseTest.logger.log(Status.SKIP, "Test skipped");
    }

}
