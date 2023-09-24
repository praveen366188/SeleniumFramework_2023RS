package page_objects;

import base_test.BaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class HomePg {
    WebDriver driver;
    Properties properties;

    public HomePg(WebDriver driver, Properties properties) {
        this.driver = driver;
        this.properties = properties;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='Home']")
    WebElement home_page_verify;

    public void verify_home_page() {
        home_page_verify.isDisplayed();

    }

}
