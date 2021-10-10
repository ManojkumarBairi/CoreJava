package javalangFeatures;

public class ThreadImpl {

	public static void main(String[] args)throws InterruptedException {
		Thread thread = new Thread();
		thread.setName("welcomeThread");    // Line 1
		thread.start();
		System.out.println("Welcome to ");
		thread.wait(2000);                  // Line 2
		System.out.println("Infosys");

	}

}
