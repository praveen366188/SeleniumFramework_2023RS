package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(listeners.ListenerClass.class)
public class DemoTestNg {
    @Test
    public void test01(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("praveenkumar");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();




    }
}
