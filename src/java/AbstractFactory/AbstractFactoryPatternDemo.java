/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory;

/**
 *
 * @author user
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactoryClass ac = FactoryProducer.getFactoryClass("SHAPE");
        Shape sh= ac.getShape("circle");
        sh.draw();
    }
}
