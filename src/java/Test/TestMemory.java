/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author user
 */
public class TestMemory {
    public static void main(String [] args) {
         
        int mb = 1024*1024;
         
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) );
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
        
       

        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) /1024);
    }
}
