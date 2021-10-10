package algo.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {2,7,4,9,24,65,78,33,54,102,0,6,56,88};
		insertionsort2(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}
	//perfect insertion sort from MIT
public static void insertionsort(int[] arr)
{
	int n=arr.length;
	for(int i=1;i<n;i++)
	{
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
	}
}

public static void insertionsort2(int[] arr)
{
	int n=arr.length;
	for(int i=1;i<n;i++)
	{
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		
	}
	
	
	
	
	
}
}
