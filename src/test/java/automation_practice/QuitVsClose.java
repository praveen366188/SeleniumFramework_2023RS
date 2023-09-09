package automation_practice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("C:\\Users\\Admin\\Downloads");
        System.out.println("---> B -->"+driver);
        //driver.close();//Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
       driver.quit();
        System.out.println("---> A -->"+driver);
        driver.get("C:\\Users\\Admin\\Downloads");
    }

}
