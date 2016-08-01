/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Vector;
import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author vishu
 */
public class GoogleApiLocationJson {

    public static void main(String ar[]) {
        JSONParser parser = new JSONParser();
        String s = "";

        try {
            URL oracle = new URL("https://maps.googleapis.com/maps/api/place/search/json?location=30.7353,76.791&radius=1000&types=bar&sensor=true&key=AIzaSyAxcIb23BGkgyUn1xCRUwJ_2mnVrKkNf7M");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                s = s + inputLine;
            }
            in.close();
            
            Object obj = parser.parse(s);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray lineItems = (JSONArray) jsonObject.get("results");
            for (Object o : lineItems) {
                JSONObject jsonLineItem = (JSONObject) o;
                String icon = jsonLineItem.get("icon").toString();
                System.out.println("icon:" + icon);
                String loc = jsonLineItem.get("geometry").toString();
                System.out.println("loc:" + loc);
                String name = jsonLineItem.get("name").toString();
                System.out.println("name:" + name);
                String adrs = jsonLineItem.get("vicinity").toString();
                System.out.println("adrs:" + adrs);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
