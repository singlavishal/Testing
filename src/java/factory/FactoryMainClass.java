/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

/**
 *
 * @author user
 */
public class FactoryMainClass {
    public static void main(String[] args) {
        FactoryClass obj= new FactoryClass();
        Shape shape=obj.getObj("circle");
        shape.draw();
        
        Shape shape1=obj.getObj("rectangle");
        shape1.draw();
    }
}
