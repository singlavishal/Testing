/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import DB.DBConnection;
import DB.servdb;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author user
 */
public class NewsGetMsisdn {
    public void getData(StringBuilder response,String msisdn){
        Document doc;
        String value="";
        String name="";
        try {
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
            
            value=response.toString();
            System.out.println(value);
            doc=Jsoup.parse(value);
            Elements ments=doc.select("tr");
            servdb db = new servdb();
            Statement stmt = db.getStatement();
            //truncate
            for(Element ment:ments){
                name=ment.getElementsByTag("td").text().toString();
                //msisdn=msisdn.substring(5, 15);
                if(name.contains("Subscriber Name")){
                    name=name.substring(16);
                    System.out.println(name);
                    String qry="insert into apr_him_new(msisdn,name)values('"+msisdn+"','"+name+"')";
                    stmt.executeUpdate(qry);
                    break;
                }  
                //insert
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
