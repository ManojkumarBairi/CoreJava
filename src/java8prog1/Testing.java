package java8prog1;

public class Testing {
	// Check if overriding or same??
	  public void method(int... a) { System.out.println(a.length); }
	  
	  public void method(int[] a) { System.out.println(a[5]); }
	 
	
	public static void main(String[] args) {
		Testing tester=new Testing ();
		int [] arr={10,20,30,40,50};
		//tester.method(arr);
	}
}