package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
//    public void afterClick(WebElement element) {
//        System.out.println("clicking the element"+element);
//    }
//    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
//        System.out.println("entering "+keysToSend+" in the element "+element);
//    }
public void onTestStart(ITestResult result) {
    System.out.println("started");
}

    public void onTestSuccess(ITestResult result) {
        System.out.println("success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("failure");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        System.out.println("on start");
    }

    public void onFinish(ITestContext context) {
        System.out.println("on finish");
    }
    
}
