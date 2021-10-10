package varargs;

import java.util.Arrays;
import java.util.List;

public class HeapPollutionTest {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B");
		List<String> l2=Arrays.asList("C","D");
		m1(l1,l2);

	}
	//If we are using var-args method with generic type then there may be a chance of Heap Pollution.
	//At runtime if one type variable trying to point to another type value ,
	//then there may be a chance of ClassCastException.This problem is called Heap Pollution.
	//In our code,If there is any chance of heap pollution then compiler will generate warnings
private static void m1(List<String>... l)//argument will become List<String>[]
{
	Object a[]=l;//we can assign List[] to Object[]
	a[0]=Arrays.asList(10,20);
	String name=(String)l[0].get(0);//String type pointing to integer type
	System.out.println(name);
	//Check in warnings about the heap pollution
}
}
