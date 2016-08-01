/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class SubtractDayFromDatetime {

    public static void main(String[] args) {
        try {
            //int days = 5;
            String date = "2014-04-08 06:05:23";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date dateType = sdf.parse(date);

            Calendar c = Calendar.getInstance();
            c.setTime(dateType); // Now use today date.
            c.add(Calendar.DATE, -1); // Adding 5 days
            String output = sdf.format(c.getTime());
            System.out.println("Dateeeeeeeeeeeeeeeeeeeeeeeeee="+output);
        } catch (ParseException ex) {
            Logger.getLogger(SubtractDayFromDatetime.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
