package javalangFeatures;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread implements Runnable {

	MyThread() {
		System.out.print("New Thread is created.");    // Line 1
	}

	@Override
	public void run() {
		try {
			System.out.print("Am from MyThread...");
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

public class FixedThreadPool {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			MyThread t1 = new MyThread();
			executor.execute(t1);
		}
		System.out.print("\nMaximum number of threads inside pool: " + executor.getMaximumPoolSize() + "\n");    // Line 2
		executor.shutdown();
	}

	}


