package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class AnnotationHelperAttributes {
    @Test
    public void test001(){
        System.out.println("test001");

    }
    @Test(dependsOnMethods = {"test001"})
    public void test002(){
        System.out.println("test002");
    }
    @Test(dependsOnMethods = {"test001","test002"})
    public void test003(){
        System.out.println("test003");
    }
    @Test
    public void test004(){
        System.out.println("test004");
    }



    //to skip the test case
    @Test(enabled = true)
    public void test005(){
        System.out.println("test005");
    }


    @Test(timeOut = 5000)
    public void test006() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2));

    }
@Parameters("pktu")
@Test
    public void test007(String p){

    System.out.println(p);
}


}
