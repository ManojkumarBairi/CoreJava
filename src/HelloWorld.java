
class Calculator{
	public void add(int a ,int b)
	{
		System.out.println("add int int");
	}
	public void add(double  a ,double b)
	{
		System.out.println("add double double");
	}
	public void add(short a ,short b)
	{
		System.out.println("add short short");
	}
	public void add(byte a ,byte b)
	{
		System.out.println("add byte byte");
	}
	
	public void add(long a ,long b)
	{
		System.out.println("add long long");
	}
	public void add(int a ,double b)
	{
		System.out.println("add int  double");
	}
	public void add(double a ,int b)
	{
		System.out.println("add double int");
	}
	
}

public class HelloWorld {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		short s=0;
		short c1=1;
		c.add(s, c1);

}
}
