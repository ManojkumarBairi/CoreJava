package siemens;
//firts h1 will be completed and then h2 will be completed
public class HackerThread extends Thread {

	
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.print(i);
		}
	}
	
	public static void main(String args[]) {
		HackerThread h1 =new HackerThread();
		h1.setPriority(MAX_PRIORITY);
	
		HackerThread h2 = new HackerThread();
		h1.setPriority(MIN_PRIORITY);
		h1.start();
		try {
			h1.join();
			
		}catch(Exception e)
		{
			System.out.println("hi");
			
		}
      h2.start();
	}
}
