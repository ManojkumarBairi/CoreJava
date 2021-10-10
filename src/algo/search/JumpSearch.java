package algo.search;

public class JumpSearch {

	public static void main(String[] args) {
		int arr[]= {23,45,65,44,33,23,12,34,54,32,34,89,93,03,90};
int x=32;
int result=jumpsearch(arr,x);
System.out.println(result);
	}
public static int jumpsearch(int[] arr,int x)
{
	int n=arr.length;
	//determine block siez
	int step=(int)Math.floor(Math.sqrt(n));
	
	int prev=0;
	while(x>arr[step])
	{
		prev=arr[step];
		
	}
	
	
	return -1;
}
}
