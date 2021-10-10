package edureka.threads;

public class MainThread {

	public static void main(String[] args) {
		Thread1 obj1 = new Thread1();
		Thread t = new Thread(new Thread2());
		obj1.start();
		
		//Thread2 obj2 = new Thread2();//-->not possible error in start is nt there
		////obj2.start();
		
	
		t.start();

	}

}
