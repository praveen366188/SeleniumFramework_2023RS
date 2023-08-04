package automation_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("name")).sendKeys("praveen");
        driver.findElement(By.id("alertbtn")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.findElement(By.id("name")).sendKeys("praveen");
        driver.findElement(By.id("confirmbtn")).click();
         alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

        driver.findElement(By.id("name")).sendKeys("praveen");
        driver.findElement(By.id("confirmbtn")).click();
        alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElements(By.xpath("(//input[@type='checkbox'])")).size());


        driver.quit();


    }
}
