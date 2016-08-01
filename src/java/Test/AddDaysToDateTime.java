/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vishu
 */
public class AddDaysToDateTime {

    public static void main(String[] args) {
        int days=5;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        //c.add(Calendar.DATE, days); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String val="";

    }
}
