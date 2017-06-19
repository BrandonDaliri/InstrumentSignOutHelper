/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentsignouthelper;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 069989069
 */
public class MainClass{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:mysql://10.242.78.48/instrumentcheckout", "ics4u", "ics4urocks");

        } catch (SQLException e) {
            System.out.println("connection failed");

        }
        Statement stmt;
        ResultSet rs = null;
   

        try {

            stmt = connection.createStatement();
String name = "1";
           rs = stmt.executeQuery("SELECT * FROM checkout where sid=\"" + name + "\"");

// Now do something with the ResultSet ....
        } catch (SQLException ex) {
        }
       
        try {
            while (rs.next()) {

//one way
                System.out.print("Name: " + rs.getObject(1));

//perhaps a better way
                String name = rs.getString("name");
            }   } catch (SQLException ex) {

        }
    }
}