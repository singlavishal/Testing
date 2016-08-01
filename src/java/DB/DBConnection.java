/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author user
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    static Connection dbconn;
    Statement stmt_db = null;

    public Statement getStatement() {
        //String dbname = db;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            dbconn = DriverManager.getConnection("jdbc:mysql://localhost/mis", "root", "");
            stmt_db = dbconn.createStatement();
        } catch (Exception e) {
            System.out.println("Exception in Manager.getConnection() -> " + e.toString());
        }
        return stmt_db;
    }

   
}
