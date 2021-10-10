package java8prog2;

import java.util.TreeMap;

public class Check {

	public static void main(String[] args) {
		TreeMap<String, String> tr = new TreeMap<String, String>();
		tr.put("1A", "Hello");
		tr.put("a", null);
		tr.put("AAA", null);
		tr.put("A", "Hello");
		System.out.println(tr);
	}
}
