package strings;
//Don’t provide “setter” methods — methods that modify fields or objects referred to by fields.
//This principle says that for all mutable properties in your class,
//do not provide setter methods. 
//Setter methods are meant to change the state of an object and this is what we want to prevent here.
//
//Make all fields final and private
//This is another way to increase immutability.
//Fields declared private will not be accessible outside the class 
//and making them final will ensure the even accidentally you can not change them.
//
//Don’t allow subclasses to override methods
//The simplest way to do this is to declare the class as final. Final classes in java can not be overridden.
//
//Special attention when having mutable instance variables
//Always remember that your instance variables will be either mutable or immutable. Identify them and return new objects with copied content for all mutable objects. Immutable variables can be returned safely without extra effort.
//
//A more sophisticated approach is to make the constructor private and construct instances in factory methods.
public final class Immutable {

	private final Integer i;
	
	private Immutable(Integer i)
	{
		this.i=i;
	}
	
	public static Immutable createNewInstance(Integer i)
	{
		return new Immutable(i);
	}
	
	public Integer geti()
	{
		return i;
	}
}
