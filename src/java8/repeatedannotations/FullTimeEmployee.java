package java8.repeatedannotations;

import java.lang.annotation.Repeatable;

class Employee{
	public void calculateSalary()
	{
		System.out.println("employee");
	}
}


@Repeatable(Modifiers.class)
@interface ModifiedBy{
	String name();
}

//--check what happens if this is uncommented
//@Repeatable(Modifiers.class)
 @interface Modifiers{
	ModifiedBy[] value();
}
public class FullTimeEmployee extends Employee{
	@ModifiedBy(name="Paul")
	@ModifiedBy(name="Richard")
	public void calculateSalary()
	{
		System.out.println("FullTimeEmployee");
	}
	public static void main(String[] args) {
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculateSalary();

	}

}
