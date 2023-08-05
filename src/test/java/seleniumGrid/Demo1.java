package seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo1 {
    @Test
    public void test001() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.38:4444"), caps);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Praveenkumar sannasi elangovan 3ds");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.close();

    }

    @Test
    public void test002() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("MicrosoftEdge");
        caps.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.38:4444"), caps);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Praveenkumar sannasi elangovan 3ds");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.close();

    }

    @Test
    public void test003() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.1.38:4444"), caps);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Praveenkumar sannasi elangovan 3ds");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.close();

    }

}
