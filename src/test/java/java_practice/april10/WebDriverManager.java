package java_practice.april10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        // Check if WebDriver instance is already created for this thread
        if (webDriverThreadLocal.get() == null) {
            // Create a new WebDriver instance (in this example, using Chrome)
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\SeleniumFramework_2023RS\\src\\main\\resources\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            // Set the WebDriver instance to the ThreadLocal variable
            webDriverThreadLocal.set(driver);
        }
        // Return the WebDriver instance associated with this thread
        return webDriverThreadLocal.get();
    }

    public static void quitDriver() {
        // Quit and remove the WebDriver instance associated with this thread
        WebDriver driver = webDriverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            webDriverThreadLocal.remove();
        }
    }
}

 class SeleniumTest {
    public static void main(String[] args) {
        // Start a new thread and execute Selenium test
        Thread thread1 = new Thread(() -> {
            // Get WebDriver instance for this thread
            WebDriver driver = WebDriverManager.getDriver();
            // Perform Selenium actions
            driver.get("https://www.example.com");
            System.out.println("Thread 1: Title is " + driver.getTitle());
            // Quit WebDriver instance when done
            WebDriverManager.quitDriver();
        });

        // Start another thread and execute Selenium test
        Thread thread2 = new Thread(() -> {
            // Get WebDriver instance for this thread
            WebDriver driver = WebDriverManager.getDriver();
            // Perform Selenium actions
            driver.get("https://www.google.com");
            System.out.println("Thread 2: Title is " + driver.getTitle());
            // Quit WebDriver instance when done
            WebDriverManager.quitDriver();
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
