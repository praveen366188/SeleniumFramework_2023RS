package step_definition;
import org.testng.annotations.Listeners;
import page_objects.HomePg;
import page_objects.LoginPg;
import base_test.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java_practice.email.SendEmail;

@Listeners(extent_report.practice.listeners.ExtentReportListener.class)
public class Step_Definition2 extends BaseTest {
    HomePg homePg;
    LoginPg loginPg;

    public Step_Definition2() throws Exception {
        homePg = new HomePg(driver, properties);
        loginPg = new LoginPg(driver, properties);
    }

    @Given("User Enter Username")
    public void user_enter_username() {
        loginPg.enter_username();
    }

    @Given("User Enter Password")
    public void user_enter_password() {
        loginPg.enter_password();
    }

    @When("User Click Login Button")
    public void user_click_login_button() {
        loginPg.click_login_button();
    }

    @Then("User See Home Page")
    public void user_see_home_page() {
        homePg.verify_home_page();
        close_browser();
    }

    @Then("We are sending mail to the user")
    public void sendEmail() throws Exception {

        SendEmail.SendTheEmail("Smoke Test Results", "Test 001 passed");
    }

}
