package practice;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";
        Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QADBPK", "root", "P#kumar128");
        Statement statement = connection.createStatement();


        ResultSet resultSet_1 = statement.executeQuery("select * from UsersLogin where PersonID=101");
        resultSet_1.next();
        System.out.println(resultSet_1.getString("Username"));
        System.out.println(resultSet_1.getString("Pwd"));
        ResultSet resultSet = statement.executeQuery("select * from UsersLogin");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("Username"));
            System.out.println(resultSet.getString("Pwd"));
        }


    }


}
