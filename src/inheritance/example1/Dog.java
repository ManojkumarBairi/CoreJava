package inheritance.example1;

public class Dog extends Animal{
	public int height = 4;
	public void speak() {
		System.out.println("bark");
	}
	
	public void fetch() {
		System.out.println("fetch ");
	}
}
