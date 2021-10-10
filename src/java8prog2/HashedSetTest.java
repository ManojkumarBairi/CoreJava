package java8prog2;

import java.util.Iterator;
import java.util.LinkedHashSet;

class HashedSetTest {
	public static void main(String args[]) {
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Siri");
		list.add("Cortana");
		list.add("Siri");
		list.add("Alexa");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}