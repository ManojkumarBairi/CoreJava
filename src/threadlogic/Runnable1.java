package threadlogic;

public class Runnable1 implements Runnable {

	public void run()
	{
		Thread.currentThread().setPriority(10);
		for(int i=0;i<12;i++)
		{
		System.out.println("In run method"+i);
		}
	}
}
