package javalangFeatures;

import java.util.HashMap;
import java.util.Map;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public boolean equals(Object ob){
		return ((Person)ob).name==this.name;
	}
	
	public int hashCode(){
		return name.length();
	}
}

public class MapImpl {

	public static void main(String[] args) {
		Map<Person,String> map=new HashMap<Person,String>(); 
		map.put(new Person("jack"),"sendSalesReport");
		map.put(new Person("jack"),"sendAuditReport");
		map.put(new Person("mady"),"sendInventoryReport");
		
		System.out.println(map.size());
		//First check direct size
		//second check size by commenting the overriden hashcode method.
	}

}
