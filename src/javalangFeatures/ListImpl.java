package javalangFeatures;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("infosys");
		al.add("google");
		al.add("ibm");
		al.add("Amazon");
		for (int j = 0; j < al.size(); j++) {
			al.remove(j);
			if (al.get(j++).equals("google")) {
				al.add("Oracle");
			}
		}
		System.out.println(al);

	}

}
