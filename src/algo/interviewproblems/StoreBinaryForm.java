package algo.interviewproblems;

public class StoreBinaryForm {
	/*Consider the problem of adding two n-bit binary integers, stored in two n-element
	arrays A and B. The sum of the two integers should be stored in binary form in
	an .n C 1/-element array C. State the problem formally and write pseudocode for
	adding the two integers*/
	public static void main(String[] args) {
		int A[]= {1,0,1,1};//11
		int B[]= {0,0,1,1};//3
		int C[]=new int[5];//C should be 14
		
		storeBinaryForm(A,B,C);
		StringBuffer s=new StringBuffer();
		for(int i:C)
		{
			System.out.print(i+" ");
			s=s.append(i);
		
		}
		System.out.println("");
		System.out.println(s);
System.out.println(Integer.parseInt(s.toString(), 2));
	}

	private static void storeBinaryForm(int A[],int B[],int C[]) {
		int n=4;
		int sum=0;
		for(int i=n-1;i>0;i--)
		{
			sum=A[i]+B[i]+C[i];
			C[i]=sum%2;
	/*		System.out.println(i);
			System.out.println(sum%2);*/
			C[i+1]=sum/2;
		}
		
	}

}
