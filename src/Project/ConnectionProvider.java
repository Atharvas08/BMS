/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("org.postgresql.Driver");
//            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bms", "postgres", "sam");
//            System.out.println("Connection Successful");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }

    }
}
