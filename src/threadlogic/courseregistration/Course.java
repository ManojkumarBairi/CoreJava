package threadlogic.courseregistration;

public class Course {
String courseName;
int numOfSeats;

public Course(String courseName, int numOfSeats) {
	this.courseName =  courseName;
	this.numOfSeats = numOfSeats;
}

public void registerForCourse(int rollNo)
{
	try
	{
		if(this.numOfSeats-1 < 0)
		{
			throw new Exception("No more seats available for this course");
			
		}
		System.out.println("Booking successfull");
		this.numOfSeats = this.numOfSeats-1;
		System.out.println("Available Seats : "+ this.numOfSeats);
		
	} catch(Exception e)
	{
		System.out.println("Error: "+ e.getMessage());
	}
}
}
