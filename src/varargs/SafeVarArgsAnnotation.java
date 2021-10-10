package varargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsAnnotation {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B");
		List<String> l2=Arrays.asList("C","D");
		m1(l1,l2);

	}
	@SafeVarargs
	private static void m1(List<String>... l)//argument will become List<String>[]
	{
	for(List<String> s:l)
	{
		System.out.println(s);
	}
	}
}
