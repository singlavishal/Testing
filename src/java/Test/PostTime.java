/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

/**
 *
 * @author vishu
 */
public class PostTime {
    public static void main(String[] args) throws ParseException {
        String elapsed="";
        String dateFromDatabase = "2013-05-07 06:05:23";	// Date from database
        
        DateFormat date = new SimpleDateFormat("d MMM yyyy");
        DateFormat time = new SimpleDateFormat("hh:mm a");
        DateFormat formatterDateFromDatabase = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateType = formatterDateFromDatabase.parse(dateFromDatabase);
        String strTime = time.format(dateType);
        String strDate = date.format(dateType);
        //System.out.println("Time:"+strTime);
        //System.out.println("Date:"+strDate);
        
        DateTime startDate = new DateTime(dateType);
        Date currentDate = new Date();  // Current Date
        DateTime dateNow = new DateTime(currentDate);
        //System.out.println("current Time:"+dateNow);

        
        Days diff = Days.daysBetween(startDate, dateNow);
        int diffDate=diff.getDays();
        //System.out.println(diffDate);
        if(diffDate==0){
            elapsed="today at "+strTime;
        }
        else if(diffDate==1){
            elapsed="yesterday at "+strTime;
        }
        else{
            elapsed=strDate+" at "+strTime;
        }
        System.out.println(elapsed);
    }
}
