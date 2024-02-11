package step_definition;

import base_test.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java_practice.email.SendEmail;
import org.testng.annotations.Listeners;
import page_objects.HomePg;
import page_objects.LoginPg;

@Listeners(extent_report.practice.listeners.ExtentReportListener.class)
public class Step_Definition1 {
    HomePg homePg;
    LoginPg loginPg;


}
