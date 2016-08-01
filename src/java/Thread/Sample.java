/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("A="+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("B="+i);
        }
    }
}
public class Sample{
    public static void main(String[] args) {
        try {
            A a = new A();
            B b = new B();
            a.setPriority(1);
            b.setPriority(10);
            a.start();
            b.start();
        } catch (Exception ex) {
            Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
