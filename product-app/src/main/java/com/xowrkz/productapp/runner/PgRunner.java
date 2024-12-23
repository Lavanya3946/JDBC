package com.xowrkz.productapp.runner;//multiple insert using executeBatch

import java.sql.*;

public class PgRunner {
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
            String insert1 = "insert into pg_info(pg_name,pg_rent)values('Golden pg',6000)";
            String insert2 = "insert into pg_info(pg_name,pg_rent)values('kalika pg',6500)";
            String insert3 = "insert into pg_info(pg_name,pg_rent)values('kushi pg',5000)";
            String insert4 = "insert into pg_info(pg_name,pg_rent)values('women pg',6000)";
            String insert5 = "insert into pg_info(pg_name,pg_rent)values('renuka pg',6500)";
            Statement statement = connection.createStatement();

            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);

            int[] row = statement.executeBatch();
            System.out.println("No of rows :" + row.length);

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
