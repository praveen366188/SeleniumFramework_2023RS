package automation_practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Static_Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        WebElement e=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dd=new Select(e);
        dd.selectByIndex(2);
        System.out.println(dd.getFirstSelectedOption().getText());
        dd.selectByValue("INR");
        System.out.println(dd.getFirstSelectedOption().getText());
        dd.selectByVisibleText("USD");
        System.out.println(dd.getFirstSelectedOption().getText());


        driver.close();


    }
}
