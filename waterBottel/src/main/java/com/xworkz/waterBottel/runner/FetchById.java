package com.xworkz.waterBottel.runner;

import java.sql.*;

public class FetchById {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/product";
            String userName = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "select * from product_info where p_id=2 ";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int productID = resultSet.getInt(1);
                String productName = resultSet.getString(2);
                Double productPrice = resultSet.getDouble(3);

                System.out.println("ProductId: " + productID + "  Product Name: " + productName + "  Product prize: " + productPrice);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                } else if (statement != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

