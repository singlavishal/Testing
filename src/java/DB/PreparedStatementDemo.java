/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PreparedStatementDemo {
    public static void main(String[] args) {
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/mis","root","");
            String qry="insert into apr_him(msisdn,status)values(?,?)";
            pstmt=con.prepareStatement(qry);
            pstmt.setString(1, "123456789");
            pstmt.setString(2, "p");
            pstmt.executeUpdate();
            
            pstmt=con.prepareStatement("delete from apr_him where sno like ?");
            pstmt.setInt(1, 1154);
            pstmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(PreparedStatementDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
