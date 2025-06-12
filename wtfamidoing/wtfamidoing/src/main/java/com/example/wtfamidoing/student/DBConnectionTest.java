package com.example.wtfamidoing.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "local";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("✅ Connection successful!");
            } else {
                System.out.println("❌ Connection failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
