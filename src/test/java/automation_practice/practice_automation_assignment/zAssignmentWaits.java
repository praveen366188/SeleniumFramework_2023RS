package automation_practice.practice_automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class zAssignmentWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

        driver.findElement(By.id("okayBtn")).click();

        WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(options);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Checkout')]")));

        List<WebElement> list = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (WebElement e : list
        ) {
            e.click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
        driver.quit();


    }
}
