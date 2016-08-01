/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.apache.log4j.Logger;

/**
 *
 * @author user
 */
public class LoggerSample {

    final static Logger logger = Logger.getLogger(LoggerSample.class);

    public static void main(String[] args) {

        if (logger.isInfoEnabled()) {
            System.out.println("hello");
            logger.info("This is info java : ");
        }
        else{
            System.out.println("else");
        }
    }
}
