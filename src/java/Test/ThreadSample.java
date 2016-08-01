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
public class ThreadSample implements Runnable {
    String threadName="";
    ThreadSample(String name){
        threadName=name;
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("hello");
        for (int i = 4; i > 0; i--) {
            try {
                System.out.println("T hread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }


    public static void main(String[] args) {

        ThreadSample obj = new ThreadSample("Thread 1");
        ThreadSample obj1 = new ThreadSample("Thread 2");
        Thread t = new Thread(obj);
        t.start();
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}
