package varargs;

public class TestVarArgs {

	public static void main(String[] args) {
		m1(10);
		m1(10,20);
		m1(10,20,30);

	}
private static void m1(int... x)

{
	//Internally Varargs is converted to array
	int arr[]=x;
	System.out.println("In Varargs metthod");
for(int y:x)
{
	System.out.println(y);
}
	
}
}
