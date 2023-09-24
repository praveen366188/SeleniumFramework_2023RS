package automation_practice.practice_automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class zAssignmentWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        Iterator<String> iterator = windows.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        System.out.println(driver.getWindowHandle());

        driver.switchTo().window(child);
        System.out.println(driver.getWindowHandle());
        String s = driver.findElement(By.cssSelector(".im-para.red")).getText();


//        String s=driver.findElement(By.className("im-para red")).getText();
        System.out.println(s);
        String un = s.split("mentor@")[1].split(" ")[0].split(".co")[0];
        System.out.println(un);
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(un);
        Thread.sleep(Duration.ofSeconds(10));
        driver.quit();


    }
}
