package java8prog1;

class BaseClass{
	//static int var1=20;
	static int var1=20;
	public static void method() {
		System.out.println("base var1="+var1);
	}
}
class ChildClass extends BaseClass{
	static int var1=50;
	
	public static void method() {
		System.out.println("child var1="+var1);
	}
}
public class Tester {
	public static void main(String[] args) {
		BaseClass b = new ChildClass();
		b.method();

	}
}
