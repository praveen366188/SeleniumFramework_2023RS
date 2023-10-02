package testNG;

import org.testng.annotations.Test;

public class Priorities {
    @Test(priority = -1)
    public void mobile01_test_case(){

        System.out.println(-1);    }
    @Test(priority = 1)
    public void mobile02_test_case(){

        System.out.println(1);     }
    @Test(priority = 0)
    public void mobile03_test_case(){

        System.out.println("0m03");     }
    @Test(priority = 2147483647)
    public void mobile04_test_case(){

        System.out.println(5000000);
    }
    @Test(priority = -5000)
    public void mobile05_test_case(){

        System.out.println(-5000);    }
    @Test(priority = 5001)
    public void ui01_test_case(){

        System.out.println(5001);    }
    @Test(priority = -10)
    public void ui02_test_case(){

        System.out.println(-10);    }
    @Test(priority = -99)
    public void ui03_test_case(){

        System.out.println(-99);
    }

    @Test
    public void desktop2_test_case(){

        System.out.println("no prd2");
    }
    @Test(groups = {"smoke"})
    public void desktop3_test_case(){

        System.out.println("no prd3");
    }

}
