package algo.interviewproblems;

public class PureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=func(2);
		System.out.println(n);
	}
	static int  func(int n)
	{
		if(n==4)
			return 2;
		else
		{
			return 2*func(n+1);
		}
	}
}
