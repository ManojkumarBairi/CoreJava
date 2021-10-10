package java8prog1;

class MySample { 
	protected int count; 
	public void displayDetails() { 
		System.out.print(count + " "); 
	}
}
public class Sample extends MySample { 
	public void displayDetails() { 
		count = 4;    // Line 1
		System.out.println(count + " "); 
	} 
	public static void main(String args[]) { 
		MySample mySample = new MySample(); 
		mySample.displayDetails(); 
		mySample = new Sample();  
		mySample.displayDetails(); 
	}
}