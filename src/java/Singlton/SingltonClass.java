/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singlton;

/**
 *
 * @author user
 */
public class SingltonClass {
   private static SingltonClass instan=new SingltonClass();
   
   private SingltonClass(){
       
   }
   public static SingltonClass getInstan(){
       return instan;
   }
   public void showData(){
       System.out.println("hello");
   }
}
