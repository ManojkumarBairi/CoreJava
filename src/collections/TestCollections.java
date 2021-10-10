package collections;

import java.util.TreeSet;

class Person implements Comparable{
	private String name;
	private String address;
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int compareTo(Object o)
{
		Person p2 = (Person)o;
		if(this.name.length() > p2.getName().length())
			return -1;
		else
			return 1;
		
		//return 0;
		}
}
public class TestCollections {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new Person("xyz", "sas"));
		t.add(new Person("xyzssss", "sas"));
		
		System.out.println(t);

	}

}
