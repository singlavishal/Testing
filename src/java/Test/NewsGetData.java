/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DB.DBConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class NewsGetData {

    public void getData(String msisdn) {
        String USER_AGENT = "Mozilla/5.0";
        HttpURLConnection conn;
        String page = "";
        String page1 = "";
        String url = "http://site2sms.com/mobile-number-tracker";
        String postParams = "action=trace-mobile-number&mobile-number="+msisdn;
        StringBuilder response = new StringBuilder();
        //url=url+date+"&service=NEWS_";
        try {
            
            URL obj = new URL(url);
            conn = (HttpURLConnection) obj.openConnection();

            // Acts like a browser
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // Send post request
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

            wr.writeBytes(postParams);

            wr.flush();

            wr.close();

            int responseCode = conn.getResponseCode();

            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + postParams);
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String current;
            while ((current = in.readLine()) != null) {
                response.append(current);
            }
            new NewsGetMsisdn().getData(response,msisdn);
            System.out.println(page);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
