package automation_practice.practice_automation_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class zAssignmentCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        ArrayList<String> veggies = new ArrayList<>(Arrays.asList("Brocolli", "Cucumber", "Beetroot"));
        for (String veggie : veggies) {
            driver.findElement(By.xpath("//h4[contains(text(),'" + veggie + "')]/following-sibling::div/button")).click();
        }
        System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='cart-info']//tr[1]")).getText(), "Items : " + veggies.size());

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.cli);
        Thread.sleep(Duration.ofSeconds(10));
        driver.quit();


    }
}
