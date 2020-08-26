package com.jorgedirkx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {

    public static void main(String[] args) {

        String sql = "INSERT INTO user(id,name) " + "VALUES (1,'Jorge') ";

        //testing the accounting_db2 connection with JDBC
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounting_db2?serverTimezone=UTC",
                "root", "Doreen1");
             Statement statement = conn.createStatement()){
             int result =statement.executeUpdate(sql);
            //or use prepared statement: PreparedStatement statement = conn.prepareStatement(sql))


            {
                System.out.println("Your connection is OK");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something went wrong");
        }
    }
}



