package threadlogic.courseregistration;

public class StartMain {

	//for Synchronization 
	public static void main(String[] args) {
		Course course1 = new Course("CSE", 1);
		RegisterThread reg = new RegisterThread(course1);
		reg.start();
		RegisterThread reg2 = new RegisterThread(course1);
		reg2.start();

	}

}
