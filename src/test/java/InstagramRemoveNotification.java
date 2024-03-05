import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class InstagramRemoveNotification {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\SeleniumFramework_2023RS\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("praveeen411");
        driver.findElement(By.name("password")).sendKeys("fyfju0-hybKez-bujtoq");
        driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();



    }
}
