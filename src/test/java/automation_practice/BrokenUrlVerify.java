package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenUrlVerify {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        List<WebElement> e = driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//a"));
        SoftAssert softAssert=new SoftAssert();
        for (WebElement e1 : e) {

            String link = e1.getAttribute("href");

            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(link).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            System.out.println(link+" with the text "+ e1.getText()+" is broken -> "+httpURLConnection.getResponseCode());
            softAssert.assertFalse(httpURLConnection.getResponseCode()>400,link + "->" + "element ->"+ e1.getText()+" -> "+httpURLConnection.getResponseCode());
        }driver.quit();

        softAssert.assertAll();




    }
}
