package threadlogic.courseregistration;

public class RegisterThread extends Thread {
Course c;

public RegisterThread(Course c)
{
	this.c = c;
}
	
	
	public void run() {
		c.registerForCourse(1);
	}
}
