package automation_practice.selenium4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Selenium4_GetHeightWidth {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //first switch to the new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        //get the window handles and iterate and switch to the newly opened window and launch url

        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
        String parent = iterator.next();
//        String child=iterator.next();
        driver.get("https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/");

        Thread.sleep(Duration.ofSeconds(5));

        String hee = driver.findElement(By.xpath("//h1[text()='Top 50 Array Coding Problems for Interviews']")).getText();

        driver.switchTo().window(parent);
        WebElement e = driver.findElement(By.name("username"));
        e.sendKeys(hee);
        e.click();

        //get height and width of the web element
        int i = e.getRect().getDimension().getHeight();
        int j = e.getRect().getDimension().getWidth();

        System.out.println("Height->" + i);
        System.out.println("Width->" + j);

        File file = e.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));

        Thread.sleep(Duration.ofSeconds(5));
        driver.quit();

    }
}
