package com.xowrkz.jdbcapp.runner;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MobileRunner {
    public static void main(String[] args) {
        System.out.println("running the main method..");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successful");
            String url = "jdbc:mysql://localhost:3306/super_market";
            String userName = "root";
            String password = "root";
            DriverManager.getConnection(url, userName, password);
            System.out.println("Jdbc connection done");
        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("JDBC class not found:" + classNotFoundException.getMessage());
        }
    }
}

