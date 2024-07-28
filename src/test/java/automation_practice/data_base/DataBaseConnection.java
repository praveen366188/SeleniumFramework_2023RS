package automation_practice.data_base;

import java.sql.*;

public class DataBaseConnection {
    public static void main(String[] args) {
        // Database connection details
        String host = "localhost";
        String port = "3306";
        String databaseName = "QADBPK";
        String username = "root";
        String password = "P#kumar128";

        // Establishing database connection
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + databaseName, username, password)) {
            Statement statement = connection.createStatement();

            // Fetching data based on specific condition
            ResultSet resultSet_1 = statement.executeQuery("select * from UsersLogin where PersonID=101");
            if (resultSet_1.next()) {
                System.out.println("Username: " + resultSet_1.getString("Username"));
                System.out.println("Password: " + resultSet_1.getString("Pwd"));
            } else {
                System.out.println("No user found with PersonID 101");
            }

            // Fetching all data from the table
            ResultSet resultSet = statement.executeQuery("select * from UsersLogin");
            while (resultSet.next()) {
                System.out.println("Username: " + resultSet.getString("Username"));
                System.out.println("Password: " + resultSet.getString("Pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
