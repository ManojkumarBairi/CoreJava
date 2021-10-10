package java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//Stream<String> msg=Stream.of("Java8","In","Action");
		//msg.forEach(System.out::print);
		
		Person p = new Person("xyz", 35);
		Person p2 = new Person("ooo", 25);
		Person p3 = new Person("lll", 30);
		Person p4 = new Person("hjjj", 20);
		Person p5 = new Person("add", 18);
		Person p6 = new Person("ppp", 58);
		Person p7 = new Person("ddd", 74);
		Person p8= new Person("rrr", 30);
		Person p9 = new Person("aqwwdd", 10);
		Person p10 = new Person("err", 7);
		
		List<Person> list = new ArrayList<>();
		list.add(p);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
	
		list.forEach(System.out :: print);
		
		Optional<Integer> minAge = list.stream()
				                   .map(x -> x.getAge())
				                   .filter(age -> age > 20)
				                   .min(Comparator.naturalOrder());
				                   
				                   
				                   
				                  
	}

}
