/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import DB.DBConnection;
import DB.servdb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MsisdnName {
    public static void main(String[] args) {
        try {
            String msisdn="";
            String qry="select msisdn from pun limit 1000,1000";
            servdb db = new servdb();
            Statement stmt = db.getStatement();
            ResultSet rs =stmt.executeQuery(qry);
            NewsGetData obj = new NewsGetData();
            while(rs.next()){
                msisdn=rs.getString(1);
                obj.getData(msisdn);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
