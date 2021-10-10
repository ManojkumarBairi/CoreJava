package java8.optionalclass;

import java.util.Optional;

class Employee{
private Optional<String> alternateEmail=Optional.empty();
public Optional<String> getAternateEmail()
{
	return alternateEmail;
}
public void setEmployee(Optional<String> alternateEmail)
{
	this.alternateEmail=alternateEmail;
}
}
public class TechSol {

	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e2=new Employee();
		e.setEmployee(Optional.of(new String("Manoj")));
		System.out.println(e.getAternateEmail().orElse("kumar"));
		System.out.println(e2.getAternateEmail().orElse("bairi"));

	}

}
