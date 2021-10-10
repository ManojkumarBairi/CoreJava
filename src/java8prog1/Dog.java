package java8prog1;

public class Dog extends Animal{
public Dog()
{
	super();
	System.out.println("DOG");
}

void eat()
{
	System.out.println("eating food");
}
void work()
{
	super.eat();
}
}
