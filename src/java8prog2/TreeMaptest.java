package java8prog2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaptest {
	public static void main(String args[]) {  
        
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(102,"Tree Map");  
        map.put(103, "Hashed Map");  
        map.put(101, "Map");  
        System.out.println("Values before remove: "+ map);    
        map.remove(102);  
        System.out.println("Values after remove: "+ map);  
    } 
}
