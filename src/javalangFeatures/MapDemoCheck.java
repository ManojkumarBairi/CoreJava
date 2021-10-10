package javalangFeatures;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoCheck {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "A");
		map.put(1, "B");
		map.put(3, "C"); 
		map.put(null,"E");  //1
		map.put(4,null);    //2
		map.put(1,"D");     //3
		Collection <String> collection = map.values();
		for(String element : collection){
			System.out.println(element);
		}

	}

}
