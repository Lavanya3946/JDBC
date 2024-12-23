package com.xworkz.PGapp.runner;
import java.sql.*;
public class FoodRunner {
    public static void main(String[] args) {
        System.out.println("running in a main method");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");
            String url="jdbc:mysql://localhost:3306/pg";
            String userName="root";
            String password="root";
            DriverManager.getConnection(url,userName,password);
            System.out.println("establish a connection");
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println("not found"+e.getMessage());
        }

    }
}
