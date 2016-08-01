/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// use of ellipses(...)
/*You need to pass in many instances of the same object type to a method,
 * but you don't know at compile time how many instances there will be. 
 * In the past, the only way to handle this situation was to bundle these objects in an array or other collection. 
 * However with J2SE 5.0, you now have the added convenience of using variable arity parameters, 
 * known less formally as varargs. 
 * In this tip, you will learn why it's a good idea to take advantage of varargs as a client of an API.
 */
package Test;

/**
 *
 * @author vishu
 */
public class ellipses {
    public static void main(String[] args) {
       //doStuff(1);
       doStuff(1,2,3);
   }
   static void doStuff(int... doar){
       for(int i:doar){
           System.out.println("value:"+i);
       }
   }  
}
