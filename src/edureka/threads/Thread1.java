package edureka.threads;

public class Thread1 extends Thread {
	public void run()
	{
		System.out.println("started thread1");
		for(int i=0;i<50;i++)
		{
			System.out.println("Thread 1 : "+ i+" running");
		}
	}

}
