package automation_practice.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class zAssignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.name("name")).sendKeys("Praveenkumar");
        driver.findElement(By.name("email")).sendKeys("praveen@ddyhf.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("praveen123");
        driver.findElement(By.id("exampleCheck1")).click();
        Select s = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
        s.selectByIndex(1);
        System.out.println(s.getFirstSelectedOption().getText());
        s.selectByVisibleText("Male");
        System.out.println(s.getFirstSelectedOption().getText());
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.id("inlineRadio2")).click();
        Assert.assertFalse(driver.findElement(By.id("inlineRadio3")).isEnabled());
        driver.findElement(By.name("bday")).sendKeys("02/02/1992");
        Thread.sleep(Duration.ofSeconds(2));

        driver.findElement(By.cssSelector(".btn.btn-success")).click();


        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
        String ss = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
        Assert.assertTrue(ss.contains("Success! The Form has been submitted successfully!."));
        driver.quit();


    }
}
