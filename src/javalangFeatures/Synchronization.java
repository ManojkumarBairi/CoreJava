package javalangFeatures;

class SynchronizedExample extends Thread
{
	synchronized public void run()
	{
		System.out.println("start");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}
		System.out.println("End");
	}
}
public class Synchronization {

	public static void main(String[] args) {
		new SynchronizedExample().start();
		new SynchronizedExample().start();

	}

}
