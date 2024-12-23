package com.xowrkz.productapp.runner;//without auto increment

import java.sql.*;

public class ProductRunner {
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

            String insert = "insert into product_info values(5,'Mobile',20000.0)";
            Statement statement = connection.createStatement();

            int row = statement.executeUpdate(insert);
            System.out.println("No of inserted: " + row);

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
