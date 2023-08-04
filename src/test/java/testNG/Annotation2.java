package testNG;

import org.testng.annotations.*;

public class Annotation2 {

    @BeforeSuite
    public void abefore_suite(){

        System.out.println("BeforeSuite-2");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("AfterSuite-2");
    }
    @BeforeTest
    public void BeforeTest(){

        System.out.println("BeforeTest-2");
    }
    @BeforeClass
    public void BeforeClass(){

        System.out.println("BeforeClass-2");
    }
    @AfterTest
    public void AfterTest(){

        System.out.println("AfterTest-2");
    }
    @AfterClass
    public void AfterClass(){

        System.out.println("AfterClass-2");
    }
    @BeforeMethod
    public void BeforeMethod(){

        System.out.println("BeforeMethod-2");
    }
    @AfterMethod
    public void AfterMethod(){

        System.out.println("AfterMethod-2");
    }


    @Test
    public void test01(){

        System.out.println("test01-an2");
    }
    @Test
    public void test02(){

        System.out.println("test02-an2");
    }


}
