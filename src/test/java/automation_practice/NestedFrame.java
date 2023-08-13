package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NestedFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

        WebElement ftop = driver.findElement(By.name("frame-top"));
        driver.switchTo().frame(ftop);
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

        System.out.println(driver.findElement(By.id("content")).getText());
        driver.switchTo().defaultContent();

        driver.quit();


    }
}
