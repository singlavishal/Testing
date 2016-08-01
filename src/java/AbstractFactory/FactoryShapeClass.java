/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactory;

import factory.*;

/**
 *
 * @author user
 */
public class FactoryShapeClass extends AbstractFactoryClass{


    @Override
    AbstractFactory.Shape getShape(String shape) {
        if(shape.equals("circle")){
            return new Circle();
        } 
        if(shape.equals("rectangle")){
            return new Rectangle();
        } 
        return null;
    }

    @Override
    Colour getColor(String clr) {
        return null;
    }
}
