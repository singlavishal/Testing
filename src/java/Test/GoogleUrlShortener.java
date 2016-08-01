/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class GoogleUrlShortener {

    public static void main(String ar[]) {
        String longUrl="wap.59000.in";
        
        try {
            URL url = new URL("http://goo.gl/api/url");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write("url=" + URLEncoder.encode(longUrl, "UTF-8"));
            writer.close();

            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = rd.readLine()) != null) {
                sb.append(line + '\n');
            }
            String json = sb.toString();
            System.out.println(json);
            //return json.substring(json.indexOf("http"), json.indexOf("\"", json.indexOf("http")));
        } catch (Exception e) {
            System.out.println(e);
            //return longUrl;
        } 
    }

}