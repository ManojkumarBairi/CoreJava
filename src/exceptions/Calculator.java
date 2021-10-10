package exceptions;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Main Method entered");
		int a =10;
		int b=0;
		try {
			int c=divide(a,b);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Method LEAVING");
	}
	public static int divide(int a ,int b)throws Exception
	{
		int c=0;;
		System.out.println("DIVIDE METHOD ENTERED");
		try {
			/*if(c==0)
			{
				throw new Exception("C is zero");
			}*/
		c=a/b;
		System.out.println(c);
		}
		/*catch(Exception e)
		{
			System.out.println("DIVIDE METHOD CATCH");	
			System.out.println(e.getMessage());	
			e.printStackTrace();	
		}*/
		finally {
			System.out.println("DIVIDE METHOD FINALLY");
		}
		System.out.println("DIVIDE METHOD LEAVING");
		return c;
	}
}
