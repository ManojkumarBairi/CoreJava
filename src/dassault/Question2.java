package dassault;
class A{
	
}
class B extends A{
	
}
public class Question2 {
public static void main (String args[]) {
	A a  =new A();
	B b = (B) new A();
	  a = new B();
	b = (B) a;
	
}
}
