package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ListenerClass2 implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver driver)  {
        System.out.println("-->beforeAlertAccept");
    }

    @Override
    public void afterAlertAccept(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterAlertDismiss(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeNavigateBack(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterNavigateBack(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeNavigateForward(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterNavigateForward(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)  {
        System.out.println("-->");

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)  {
        System.out.println("-->");

    }

    @Override
    public void beforeScript(String script, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterScript(String script, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target)  {
        System.out.println("-->");

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot)  {
        System.out.println("-->");

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver)  {
        System.out.println("-->");

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text)  {
        System.out.println("-->");

    }
//    public void afterClick(WebElement element)  {
//        System.out.println("clicking the element"+element);
//    }
//    public void afterSendKeys(WebElement element, CharSequence... keysToSend)  {
//        System.out.println("entering "+keysToSend+" in the element "+element);
//    }
}
