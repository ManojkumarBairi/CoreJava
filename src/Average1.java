
public class Average1 {

	public static void main(String[] args) {
		//int X[]=new int[10];
		int	X[]= {0,1,2,3,4,5,6,7,8,9};
		int A[]=new int[10];
		int n=X.length;
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<=n-1;i++)
		{
			int a=0;
			for(int j=0;j<=i;j++)
			{
				a=a+X[j];
				A[i]=a/(i+1);
				
			}
			
		}
		System.out.println(System.currentTimeMillis());
		for(int k:A)
		{
			System.out.print(k+" ");
		}
		System.out.println("\n"+"A better algorithm");
		//Better algortihm
		int	Y[]= {0,1,2,3,4,5,6,7,8,9};
		int B[]=new int[10];
		int L=Y.length;
		System.out.println(System.currentTimeMillis());
		int s=0;
		for(int i=0;i<n;i++)
		{
			s=s+Y[i];
			B[i]=s/(i+1);
		}
		System.out.println(System.currentTimeMillis());
		for(int k:B)
		{
			System.out.print(k+" ");
		}
		
	}

}
