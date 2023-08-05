package practice;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) throws SQLException {
        String host="localhost";
        String port="3306";
        Connection connection=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QADBPK","root","P#kumar128");
        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery("select * from UsersLogin where PersonID=101");
        ResultSet resultSet=statement.executeQuery("select * from UsersLogin");

//        resultSet.next();
//        System.out.println(resultSet.getString("Username"));
//        System.out.println(resultSet.getString("Pwd"));
while (resultSet.next()){
            System.out.println(resultSet.getString("Username"));
        System.out.println(resultSet.getString("Pwd"));
}


    }



}
