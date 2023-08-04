package testNG;

import org.testng.annotations.*;

public class Annotation1 {

    @BeforeSuite
    public void bbefore_suite(){

        System.out.println("bBeforeSuite1");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("aAfterSuite1");
    }
    @BeforeTest
    public void BeforeTest(){

        System.out.println("BeforeTest1");
    }
    @BeforeClass
    public void BeforeClass(){

        System.out.println("BeforeClass1");
    }
    @AfterTest
    public void AfterTest(){

        System.out.println("AfterTest1");
    }
    @AfterClass
    public void AfterClass(){

        System.out.println("AfterClass1");
    }
    @BeforeMethod
    public void BeforeMethod(){

        System.out.println("BeforeMethod1");
    }
    @AfterMethod
    public void AfterMethod(){

        System.out.println("AfterMethod1");
    }


    @Test
    public void test01(){

        System.out.println("test01_an1");
    }
    @Test
    public void test02(){

        System.out.println("test02_an1");
    }


}
