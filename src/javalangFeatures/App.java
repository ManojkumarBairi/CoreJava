package javalangFeatures;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		//s.add(2);
		s.add("1");
		s.add("3");
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}

	}

}
