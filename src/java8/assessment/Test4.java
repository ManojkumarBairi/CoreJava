package java8.assessment;
interface StaticInterface {
	public static void staticMethod() {
		System.out.println("inside interface");
	}
}

class StaticInterfaceImpl implements StaticInterface {
	public void staticMethod() {
		System.out.println("inside class");
	}
}
public class Test4 {

	public static void main(String[] args) {
		
		new StaticInterfaceImpl().staticMethod();
	}

}
