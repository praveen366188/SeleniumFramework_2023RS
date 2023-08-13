package automation_practice.assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Table_assignment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println("Number of rows in the table ->"+driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr")).size());
        System.out.println("Number of column in the table ->"+driver.findElements(By.xpath("//table[@id='product' and @name='courses']//tr/th")).size());
        System.out.println("The second row course content ->"+driver.findElement(By.xpath("//table[@id='product' and @name='courses']//tr[3]/td[2]")).getText());

        //selecting values form the dynamic dropdown

        String desired_country="United States (USA)";
        driver.findElement(By.id("autocomplete")).sendKeys(desired_country.substring(0,3));
        Thread.sleep(2000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        System.out.println( driver.findElement(By.id("autocomplete")).getAttribute("value"));


        driver.quit();


    }
}
