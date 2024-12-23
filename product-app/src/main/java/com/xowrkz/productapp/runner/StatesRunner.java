package com.xowrkz.productapp.runner;//with auto increment

import java.sql.*;

public class StatesRunner {
    public static void main(String[] args) {
        System.out.println("running in the method..");

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver found");

            String url = "jdbc:mysql://localhost:3306/product";
            String userName = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, userName, password);

            System.out.println(" connection establish success");
            String insert = "insert into states_info values(0,'Manipur','Imphal')";
            Statement statement = connection.createStatement();

            int row = statement.executeUpdate(insert);
            System.out.println("No of rows inserted:" + row);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("jdbc not found:" + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

