/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class SubtractTimeFormDate {
    public static void main(String[] args) {
        int days=-5;
        int tym=-30;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.HOUR, days); // Adding 5 days
        c.add(Calendar.MINUTE, tym); // Adding 5 days
        String output = sdf.format(c.getTime());
        System.out.println(output);
        String val="";

    }
}
