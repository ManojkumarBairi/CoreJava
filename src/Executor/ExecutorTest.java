package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorTest {

	public static void main(String[] args) {
		Thread1 t=new Thread1();
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		Thread1 t4=new Thread1();
		Thread1 t5=new Thread1();
		
		Executor ex=Executors.newFixedThreadPool(2);
		ex.execute(t);
		ex.execute(t1);
		ex.execute(t2);
		ex.execute(t3);
		for(int i=0;i<10;i++)
		{
		System.out.println("MAIN "+ i);
		}
	}

}
