package automation_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Window {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String parent=iterator.next();
        String child= iterator.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());

        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
        driver.quit();


    }
}
