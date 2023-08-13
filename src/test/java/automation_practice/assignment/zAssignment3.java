package automation_practice.assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class zAssignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        int i = new Random().nextInt(3 - 1 + 1) + 1;


        List<WebElement> list = driver.findElements(By.xpath("//input[ @type='checkbox' and contains(@id,'check')]"));
        list.get(i).click();
        String option_value = list.get(i).getAttribute("value");

        System.out.println(option_value);

        Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByValue(option_value);
        option_value = s.getFirstSelectedOption().getText();
        System.out.println(option_value);
        driver.findElement(By.id("name")).sendKeys(option_value);
        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();
        String alert_message = alert.getText();
        System.out.println(alert_message);
        Assert.assertTrue(alert_message.contains(option_value));
        driver.quit();


    }
}
