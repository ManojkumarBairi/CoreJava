package java8prog2;

import java.util.HashMap;
import java.util.Map;

class MapTest {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(100, "Gmail");
			hashMap.put(103, "Rediff");
			hashMap.put(101, "Yahoo");
			hashMap.put(102, "Rediff");
			for(Map.Entry map : hashMap.entrySet()) {
				System.out.println(map.getKey() + " "+map.getValue());
		}
	}
}