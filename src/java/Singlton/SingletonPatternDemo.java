/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singlton;

/**
 *
 * @author user
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //SingltonClass obj1=new SingltonClass();
        SingltonClass obj=SingltonClass.getInstan();
        obj.showData();
    }
}
