package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;

public class HeadLessExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\SeleniumFramework_2023RS\\src\\main\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.name("username")).sendKeys("Praveenkumar");
        driver.findElement(By.name("password")).sendKeys("Praveenkumar");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Assert.assertEquals(driver.findElement(By.className("_ab2z")).getText(),"Sorry, your password was incorrect. Please double-check your password.");
  driver.close();
    }
}
