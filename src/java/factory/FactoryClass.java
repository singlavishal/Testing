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
public class FactoryClass {
    public Shape getObj(String shp){
        if(shp.equals("circle")){
            return new Circle();
        } 
        if(shp.equals("rectangle")){
            return new Rectangle();
        } 
        return null;
    }
}
