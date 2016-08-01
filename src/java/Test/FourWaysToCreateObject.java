/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class FourWaysToCreateObject {
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args)  {
        try {
            //first way
            FourWaysToCreateObject obj= new FourWaysToCreateObject();
            obj.display();
            
            //second way
            Class c1= Class.forName("Test.FourWaysToCreateObject");
            FourWaysToCreateObject obj1=(FourWaysToCreateObject) c1.newInstance();
            obj1.display();
            
            //Third way
        } catch (Exception ex) {
            Logger.getLogger(FourWaysToCreateObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
