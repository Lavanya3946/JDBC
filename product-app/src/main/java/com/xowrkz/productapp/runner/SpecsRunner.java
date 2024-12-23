package com.xowrkz.productapp.runner;

import java.sql.*;


public class SpecsRunner {
    public static void main(String[] args) {
        System.out.println("running in the method..");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver found");
            String url = "jdbc:mysql://localhost:3306/product";
            String userName = "root";
            String password = "root";
            DriverManager.getConnection(url, userName, password);
            System.out.println(" connection establish success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("jdbc not found:" + e.getMessage());
        }
    }
}
