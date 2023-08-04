package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LoginPg {
    WebDriver driver;
    Properties properties;
    public LoginPg(WebDriver driver, Properties properties) {
        this.driver=driver;
        this.properties=properties;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="username")
    WebElement username_loc;
    @FindBy(name="password")
    WebElement password_loc;
    @FindBy(xpath="//div[text()='Log in']")
    WebElement login_btn;


    public void enter_username(){
        username_loc.sendKeys(properties.getProperty("instagram_username"));
    }

    public void enter_password(){
        password_loc.sendKeys(properties.getProperty("instagram_password"));

    }

    public void click_login_button(){
        login_btn.click();
    }

}
