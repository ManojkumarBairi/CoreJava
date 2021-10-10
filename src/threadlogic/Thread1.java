package threadlogic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread1 extends Thread{
public void run()
{
	for(int i=0;i<12;i++)
	{
	System.out.println("In run method"+i);
	}
}

public static void main(String args[])
{
	/*Thread1 t=new Thread1();
	t.start();
	Thread.currentThread().setPriority(MAX_PRIORITY);
	*/
	
	Thread1 t =new Thread1();
/*	ExecutorService e=Executors.newSingleThreadExecutor();
	e.execute(t);
	e.execute(Thread.currentThread());
	e.shutdown();*/
	t.setDaemon(true);
	t.start();
	//t.setDaemon(false);
	for(int i=0;i<12;i++)
	{
	System.out.println("In main Method"+i);
	}
	
}
}
