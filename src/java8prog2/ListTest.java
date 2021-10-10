package java8prog2;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String args[]) {
		List<String> list = new LinkedList<String>();
		list.add("iwa");
		list.add("Ria");
		list.add("Iwa");
		list.add(1, "Siya");
		System.out.println("Element at 2nd position:\n" + list.get(2));
		for (String s : list) {
			System.out.println(s);
		}
	}
}