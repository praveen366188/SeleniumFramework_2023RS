package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class LinksInPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        System.out.println(driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//a")).size());
        List<WebElement> e=driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//a"));
        Actions a =new Actions(driver);
int i=0;
        for (WebElement e1:e) {

            a.moveToElement(e1);
            e1.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

        }
//        System.out.println(driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//a")).size());

        Set<String> s=driver.getWindowHandles();
        for (String s1: s) {
            driver.switchTo().window(s1);
            System.out.println(i+"->"+driver.getTitle());
            i++;
        }
        driver.quit();


    }
}
