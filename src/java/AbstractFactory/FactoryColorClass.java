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
public class FactoryColorClass extends AbstractFactoryClass{

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Colour getColor(String clr) {
        if (clr.equals("red")) {
            return new Red();
        }
        if (clr.equals("blue")) {
            return new Blue();
        }
        return null;
    }
}
