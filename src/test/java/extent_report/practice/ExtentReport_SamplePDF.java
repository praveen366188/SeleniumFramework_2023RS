package extent_report.practice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;

public class ExtentReport_SamplePDF {


    public static void main(String[] args) {
        ExtentReports extentReport = new ExtentReports();
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("extent_index.html");
        extentSparkReporter.config().setReportName("Automation Report");
        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Automation report name");
        extentSparkReporter.config().setDocumentTitle("set document title");
        extentReport.attachReporter(extentSparkReporter);

        ExtentTest extentTest = extentReport.createTest("test name 01");
        extentTest.log(Status.PASS, "pass message");
        extentTest.log(Status.FAIL, "pass message");
        extentTest.log(Status.SKIP, "pass message");
        extentTest.log(Status.INFO, "pass message");
        extentTest.warning("warning");
        extentTest.log(Status.INFO, "pass message");
        extentTest.log(Status.INFO, "pass message");
        extentTest.assignAuthor("praveen");
        ExtentTest extentTest1 = extentReport.createTest("test name 02");
        extentTest1.log(Status.PASS, "pass message");
        extentTest1.log(Status.FAIL, "pass message");
        extentTest1.log(Status.SKIP, "pass message");
        extentTest1.log(Status.INFO, "pass message");
        extentTest1.warning("warning");
        extentTest1.log(Status.INFO, "pass message");
        extentTest1.log(Status.INFO, "pass message");
        extentTest1.assignAuthor("charu");
        ExtentTest extentTest2 = extentReport.createTest("test name 03");
        extentTest2.log(Status.PASS, "pass message");
        extentTest2.log(Status.FAIL, "pass message");
        extentTest2.log(Status.SKIP, "pass message");
        extentTest2.log(Status.INFO, "pass message");
        extentTest2.warning("warning");
        extentTest2.log(Status.INFO, "pass message");
        extentTest2.log(Status.INFO, "pass message");
        extentTest2.assignAuthor("tejal");
        extentReport.flush();


    }

}
