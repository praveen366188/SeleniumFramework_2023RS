package automation_practice.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class StandaloneTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void bf() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @AfterMethod
    public void am() {
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/client/");
        driver.findElement(By.id("userEmail")).sendKeys("praveen366188@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("au*!ZYRZV8S#Jb");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-custom' and contains(text(),'HOME')]")).isDisplayed();
        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
//        for (WebElement e : products
//        ) {
//            String s1 = e.findElement(By.cssSelector("b")).getText();
//            if (s1.equals("ADIDAS ORIGINAL"))
//                e.findElement(By.xpath("//button[2]")).click();
//        }
        products.stream().filter(s -> s.findElement(By.cssSelector("b")).getText().equals("adidas original")).forEach(System.out::println);
        WebElement p = products.stream().filter(s -> s.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
        assert p != null;
        System.out.println(p.findElement(By.cssSelector("b")).getText());
        p.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
        driver.findElement(By.xpath("//h1[text()='My Cart']")).isDisplayed();

       List<WebElement> cart_products= driver.findElements(By.cssSelector(".cartSection h3"));
        Assert.assertTrue(cart_products.stream().anyMatch(s->s.getText().equals("ADIDAS ORIGINAL")));
        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[contains(@class,'ta-results')]")));
        driver.findElement(By.xpath("//span[text()=' India']")).click();

        Actions actions=new Actions(driver);
        WebElement ee=driver.findElement(By.xpath("//a[contains(@class,'action__submit')]"));
//        actions.moveToElement(driver.findElement(By.xpath("//a[contains(@class,'action__submit')]"))).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'action__submit')]")));
//        actions.scrollToElement(ee).build().perform();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    Thread.sleep(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//a[contains(@class,'action__submit')]")).click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Order Placed Successfully']")));
       String order_no= driver.findElement(By.xpath("//label[contains(text(),'| ')]")).getText();
Assert.assertEquals(driver.findElement(By.cssSelector(".hero-primary")).getText().trim(),"THANKYOU FOR THE ORDER.");
        System.out.println(order_no);
    }


}
