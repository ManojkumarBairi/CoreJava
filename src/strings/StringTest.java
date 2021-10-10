package strings;

public class StringTest {
	public void compare(String shape)
    {
		if("null".equals(shape)) {  // line 5
			System.out.println("Hi");
	}
	if(shape.equals("null")) {  // line 8
		System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		
		//Case 1
		//StringTest t = new StringTest();
		//t.compare(null);
		
		//case 2
		//if x= no of z and y is no of o then 2*x should be y
//		String z = "zzoooo";
//		//String z ="zzzoooooo";
//		System.out.println(z);
//		//String zs = z.copyValueOf(new char['z']);
//		//String zo = z.copyValueOf(new char['o']);
//		int x =z.lastIndexOf('z')+1;
//	    int y = z.lastIndexOf('o')-(x-1);
//		System.out.println(x);
//		System.out.println(y);
//		//System.out.println(zo);
		
		//case 3:
		//get first value in integer if 234 the first is 2 and concat to String and then to Integer
		Integer x =2134;
		String  y = x.toString().substring(x.toString().length()-1);
		System.out.println(y);
		
		
	}

}
