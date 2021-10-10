package algo.sort;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr= {0,3,4,2,2,5,1,3};
		printArray(arr);
	int range=5;
		//System.out.println("After count sort");
		countingsort(arr,range);
		//printArray(arr);

	}
	private static void countingsort(int arr[],int range)
	{
		int[] arrcount=new int[range+1];
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			arrcount[temp]=arrcount[temp]+1;

		}
		printArray(arrcount);
		System.out.println("after modification");
		for(int i=1;i<arrcount.length;i++)
		{
			
			arrcount[i]=arrcount[i]+arrcount[i-1];

		}
		printArray(arrcount);
		int x=arr.length;
		int[] copyarr=new int[x];
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int position=arrcount[temp];
			copyarr[position-1]=temp;
			arrcount[temp]=arrcount[temp]-1;
		}
		System.out.println("after count sort");
		printArray(copyarr);
	}
	
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
