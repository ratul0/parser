/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ratul
 */
public class SQLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con = null;
        PreparedStatement pst = null;

    
        String url = "jdbc:postgresql://localhost/thesis";
        String user = "postgres";
        String password = "1234";

        try {
            int id = 6;
            String author = "Trygve Gulbranssen";
            con = DriverManager.getConnection(url, user, password);

            String stm = "INSERT INTO prothom-alo (link, status) VALUES(?, ?)";
            pst = con.prepareStatement(stm);
            pst.setString(1, author);
            pst.setInt(2, id);                    
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error");

        } finally {
        }
    }
    
}
