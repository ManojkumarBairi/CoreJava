package algo.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {2,5,8,11,18,25,36,78,414,588};
		int x=414;
		int start=arr.length;
		int end=start-1;
		int index=binarySearch(arr,0,start-1,x);
		System.out.println(index);
	}
	//time compleity is O(logn)
public static int binarySearch(int[] arr,int start,int end,int x)
{
	if(end>=1)
	{
	int mid=start+(end-1)/2;
	if(arr[mid]==x)
	{
		return mid;
	}else if(x>arr[mid])
	{
		return binarySearch(arr,mid+1,end,x);
	}
	else if(x<arr[mid])
	{
	return	binarySearch(arr,start,mid-1,x);
	}
	}
	return -1;
}
}
