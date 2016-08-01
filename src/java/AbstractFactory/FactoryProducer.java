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
public class FactoryProducer {
    public static AbstractFactoryClass getFactoryClass(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new FactoryShapeClass();
        }
        if(choice.equalsIgnoreCase("COLOR")){
            return new FactoryColorClass();
        }
        return null;
    }
}
