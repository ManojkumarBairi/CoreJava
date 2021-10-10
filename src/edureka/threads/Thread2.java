package edureka.threads;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread 2 runnable");
		for(int i=0;i<50;i++)
		{
			System.out.println("Thread 2 : "+ i + " running");
		}
		
	}

}
