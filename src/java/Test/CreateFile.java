/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vishu
 */
public class CreateFile {
    public static void main(String ar[]){
        File dir= new File("D:\\images\\vishu");
        char[] s=new char[50];
        try {
           dir.mkdir();
           File file = new File(dir,"newfile.txt");
           FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("hello");
            pw.println("Rakeshhhhhhh");
            fw.flush();
            pw.close();
           FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String c;
            while((c=br.readLine())!=null){
           
            System.out.println(c);
            } 
            //fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
