package base_test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static Properties properties;
    public static ExtentTest logger;
    public static ExtentReports report;
    final public static String path = System.getProperty("user.dir");

    public BaseTest() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(path + "\\src\\main\\resources\\configuration\\config.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        launch_browser();
        launch_url();
    }

    public void launch_browser() {
        if (properties.getProperty("browser").equals("chrome")) {
            driver = new ChromeDriver();
        } else if (properties.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();
        }else if (properties.getProperty("browser").equals("edge")) {
            driver = new FirefoxDriver();
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();



    }

    public void launch_url() {
        driver.get(properties.getProperty("url"));

    }

    public void close_browser(){

        driver.close();
    }
}
