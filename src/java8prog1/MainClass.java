package java8prog1;

public class MainClass 
{
	MainClass() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	public MainClass(float a) {
		System.out.println("PUBLIC CONSTRUCTOR");
	}
	protected MainClass(int a) {
		System.out.println("PROTECTED CONSTRUCTOR");
	}
	private MainClass(double a) {
		System.out.println("PRIVATE CONSTRUCTOR");
	}
    public static void main(String[] args) {
    	new MainClass(4.0);
    }
}