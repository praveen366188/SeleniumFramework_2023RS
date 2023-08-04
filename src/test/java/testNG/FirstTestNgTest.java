package testNG;

import org.testng.annotations.Test;

public class FirstTestNgTest {
    @Test(groups = "smoke")
    public void mobile01_test_case(){

        System.out.println("mobile test case - smoke");
    }
    @Test
    public void mobile02_test_case(){

        System.out.println("mobile test case");
    }
    @Test
    public void mobile03_test_case(){

        System.out.println("mobile test case");
    }
    @Test(groups = {"smoke"})
    public void mobile04_test_case(){

        System.out.println("mobile test case smokeee");
    }
    @Test
    public void mobile05_test_case(){

        System.out.println("mobile test case- no group tag added");
    }
    @Test
    public void ui01_test_case(){

        System.out.println("ui test case");
    }
    @Test
    public void ui02_test_case(){

        System.out.println("ui test case");
    }
    @Test
    public void ui03_test_case(){

        System.out.println("ui test case");
    }
    @Test(groups = {"smoke"})
    public void ui04_test_case(){

        System.out.println("ui test case-smoke");
    }
    @Test(groups = {"Regression"})
    public void desktop1_test_case(){

        System.out.println("desktop test case");
    }
    @Test(groups = {"Regression"})
    public void desktop2_test_case(){

        System.out.println("desktop test case");
    }
    @Test(groups = {"smoke"})
    public void desktop3_test_case(){

        System.out.println("desktop test case-smokeees");
    }

}
