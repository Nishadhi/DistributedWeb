/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bimla Madhavee
 */
final class DbConnection {

    public Connection connection = null;

    public static String driver = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/hotel_reservation";

    //db details
    public static String username = "root";

    protected static String password = "";

    //constructor
    public DbConnection() {
        connection = DbConnection.dbConnector();

    }

    public static Connection dbConnector() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "connection successfull");

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {

            ex.printStackTrace();

        }

        return con;
    }

    /*   public static void main(String[] args) {
     Connection con = dbConnector();
     if (con == null) {
     JOptionPane.showMessageDialog(null, "can't connect");
     }
     }*/
}
