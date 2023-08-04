package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Date {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

       driver.findElement(By.className("ui-datepicker-trigger")).click();
       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       driver.findElement(By.xpath("(//button[contains(@class,'ui-datepicker-trigger')])[2]")).click();
       driver.findElement(By.xpath("(//a[contains(@class,'ui-state-highlight')]/following::a[contains(@class,'ui-state-default')])[2]")).click();
       Thread.sleep(Duration.ofSeconds(4));

        driver.close();


    }
}
