package automation_practice.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class zAssignmentLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        Assert.assertEquals(driver.getCurrentUrl(),"https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("reset-pwd-btn")).click();

        String password_string=driver.findElement(By.className("infoMsg")).getText();
        System.out.println(find_password(password_string));


//        System.out.println( driver.getPageSource());
driver.close();


    }
    public static String find_password(String password){

//        String[] s1=password.split("'");
//       String[] s2=s1[1].split("'");
//       String pwd=s2[0];
//        System.out.println(pwd);
//        return pwd;
        return password.split("'")[1].split("'")[0];

    }
}
