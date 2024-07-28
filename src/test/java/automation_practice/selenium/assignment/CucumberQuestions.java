package automation_practice.selenium.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CucumberQuestions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("<---------------- Site 1 ------------------->");

//        driver.get("https://www.interviewbit.com/cucumber-interview-questions/");
//        List<WebElement> elements= driver.findElements(By.xpath("//h3"));
//        for (WebElement e:elements) {
//            System.out.println(e.getText());
//        }
        System.out.println("<---------------- Site 2 ------------------->");

        driver.navigate().to("https://rahulshettyacademy.com/blog/index.php/2022/01/06/cucumber-nterview-questions/");
        List<WebElement>  elements= driver.findElements(By.xpath("//div[contains(@class,'thrv_wrapper tve-toc-heading tve-toc-heading-level1 tve_no_icons')]"));

        for (WebElement e:elements) {
            System.out.println(e.getText());
        }


        driver.quit();


    }
}
