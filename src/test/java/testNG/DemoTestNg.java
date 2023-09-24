package testNG;

import base_test.BaseTest;
import com.aventstack.extentreports.Status;
import listeners.ListenerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page_objects.HomePg;
import page_objects.LoginPg;

import java.time.Duration;

//run smoke test suite xml to test generate extent reports
public class DemoTestNg extends BaseTest {
    LoginPg loginPg;
    HomePg homePg;

    public DemoTestNg() throws Exception {
        loginPg = new LoginPg(driver, properties);
        homePg = new HomePg(driver, properties);
    }

//    @BeforeMethod
//    public void before_method() {
//        launch_browser();
//        launch_url();
//    }

//    @AfterMethod
//    public void after_method() {
//        close_browser();
//    }

    @Test
    public void test01() {

        loginPg.enter_username();
        BaseTest.logger.log(Status.INFO,"entering username");

        loginPg.enter_password();
        BaseTest.logger.log(Status.INFO,"entering password");

        loginPg.click_login_button();
        BaseTest.logger.log(Status.INFO,"click login button");

        homePg.verify_home_page();
        BaseTest.logger.log(Status.INFO,"Verify home page");

        close_browser();
    }
}
