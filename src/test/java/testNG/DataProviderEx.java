package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

    @Test(dataProvider = "getdata")
    public void test001(String username,String password ) {
        //2 values are coming on every run so we have to add 2 parameters
        System.out.println(username+"-->"+password);
    }

    @DataProvider
    public Object[][] getdata() {
        Object[][] data = new Object[3][2];
        data[0][0] = "praveen";
        data[0][1] = "praveen123";

        data[1][0] = "tejal";
        data[1][1] = "tejal123";

        data[2][0] = "charu";
        data[2][1] = "charu123";
        return data;
    }
}
