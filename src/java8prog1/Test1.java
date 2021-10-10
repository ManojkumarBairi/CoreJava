package java8prog1;

public class Test1 {

	public static void main(String[] args) {
		int x[]= {12,14,5,4,2,7};
		getlowestvalue(x);

	}
private static void getlowestvalue(int arr[])
{
	int low=arr[0];
	for(int i=1;i<arr.length;i++)
	if(low>arr[i])
		low=arr[i];
	
	System.out.println(low);
	
}
}
