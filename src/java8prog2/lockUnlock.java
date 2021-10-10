package java8prog2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockUnlock {

	public static void main(String[] args) {
		
		 Lock lock1 = new ReentrantLock();
	        Lock lock2 = new ReentrantLock();
	        try {
	            System.out.println("Locking...");
	            lock1.lock();
	            System.out.println("In critical section");
	        }
	        finally {
	            lock2.unlock();
	            System.out.println("Unlocking ...");
	        }
	    }
	}


