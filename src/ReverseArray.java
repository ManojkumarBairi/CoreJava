
public class ReverseArray {

	public static void main(String[] args) {
		int n=5;
		int d=4;
		int[] arr=new int[5];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
for(int k:arr)
{
	System.out.print(k+" ");
}
System.out.println(" ");
leftrotate(arr,d);
for(int k:arr)
{
	System.out.print(k+" ");
}

	}
	public static void leftrotate(int[] arr, int d)
	{
		int n=arr.length;
		reversearray(arr,0,d-1);
		reversearray(arr,d,n-1);
		reversearray(arr,0,n-1);
	}
	
	public static void reversearray(int[] arr,int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
