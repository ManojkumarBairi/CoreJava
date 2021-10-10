package exceptions;

public class ReturnInCatch {

	public static Integer m1() {
		try {
			System.out.println("try");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("catch");
			return 2;
		}
		finally {
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		
             int x =  m1();
             System.out.println(x);
	}

}
