/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionSample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class HashMapSample {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("a");
        hs.add("b");
        hs.add("a");
        hs.add("d");
        hs.add("c");
        
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        HashMap hm= new HashMap();
        hm.put("1", "abc");
        hm.put("2", "def");
        Set s= hm.entrySet();
        Iterator it= s.iterator();
        while(it.hasNext()){
            Map.Entry mt=(Map.Entry)it.next();
            System.out.println(mt.getKey()+":"+mt.getValue());
        }
    }    
}
