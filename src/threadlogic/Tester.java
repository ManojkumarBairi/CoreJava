package threadlogic;

public class Tester {

	public static void main(String[] args) {
		Runnable r1=new Runnable1();
		Thread t=new Thread(r1);
		t.start();
		t.run();
		Thread.currentThread().setPriority(1);
		for(int i=0;i<12;i++)
		{
		System.out.println("In main Method"+i);
		}

	}

}
