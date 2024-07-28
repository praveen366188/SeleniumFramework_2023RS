package step_definition;

import base_test.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java_practice.email.SendEmail;
import org.testng.annotations.Listeners;
import page_objects.HomePg;
import page_objects.LoginPg;

@Listeners(extent_report.practice.listeners.ExtentReportListener.class)
public class StepDefinition2 extends BaseTest {
    private HomePg homePage;
    private LoginPg loginPage;

    public StepDefinition2() throws Exception {
        homePage = new HomePg(driver, properties);
        loginPage = new LoginPg(driver, properties);
    }

    @After
    public void after_method(){
        if(driver!=null)
            driver.quit();
    }

    @Given("User Enter Username")
    public void userEnterUsername() {
        loginPage.enter_username();
    }

    @Given("User Enter Password")
    public void userEnterPassword() {
        loginPage.enter_password();
    }

    @When("User Click Login Button")
    public void userClickLoginButton() {
        loginPage.click_login_button();
    }

    @Then("User See Home Page")
    public void userSeeHomePage() {
        homePage.verify_home_page();
        close_browser();
    }

    @Then("We are sending mail to the user")
    public void sendEmail() throws Exception {
        SendEmail.SendTheEmail("Smoke Test Results", "Test 001 passed");
    }
}
