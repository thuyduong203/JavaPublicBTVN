/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class SQLServerConnection {

    public static Connection getConnection() {
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=Lab5_6_V2_De1;encrypt=true;trustservercertificate=true";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, "sa", "12123");
        } // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
