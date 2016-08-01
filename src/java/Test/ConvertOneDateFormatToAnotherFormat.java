/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class ConvertOneDateFormatToAnotherFormat {

    public static void main(String[] args) {
        /*SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String inputdate = "2014-08-02";
        Date date = null;
        try {
            date = form.parse(inputdate);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        SimpleDateFormat postFormater = new SimpleDateFormat("dd MMM yyyy");
        String resultdate = postFormater.format(date);
        System.out.println(resultdate);*/
        
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String inputdate = "2014-08-02 12:20:10";
        Date date = null;
        try {
            date = form.parse(inputdate);
        } catch (ParseException e) {
            e.printStackTrace();

        }
        SimpleDateFormat postFormater = new SimpleDateFormat("yyyyMMddhhmmss");
        String resultdate = postFormater.format(date);
        System.out.println(resultdate);
    }
}
