package inheritance.example1;

public class InheitMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.height);
		a.speak();
		
		
		Animal d = new Dog();
		System.out.println(d.height);
		d.speak();
		((Dog) d).fetch();
		System.out.println(d.height);
		System.out.println(((Dog)d).height);
		
		Dog d1 = new Dog();
		System.out.println(d1.height);
		d1.speak();

	}

}
