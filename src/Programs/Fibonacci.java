package Programs;

public class Fibonacci {

	void fib(int n)
	{
		int a,b,c;
		a=0;b=1;
		System.out.println(0);
		System.out.println(1);
		for(int i=0;i<n;i++)
		{
			/*if(i==1)
			{
				b=1;
			}else {
				b=i+1;
				}
			 a=i;*/
			
			 c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		//	System.out.println(c);
			
		}
	}
	public static void main(String[] args) {
		
int n=8;
new Fibonacci().fib(n);

//System.out.println(result);
	}

}
