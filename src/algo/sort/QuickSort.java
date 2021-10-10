package algo.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {10,20,55,5,86,41,56,88,2,80,63,90};
		printArray(arr);
		int low=0;//start index
		int high=arr.length-1;//end index
		System.out.println("After quick sort");
		quicksort(arr,low,high);
		printArray(arr);

	}
	private static void quicksort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
		}
	}
	
	private static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		int temp2=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp2;
		return (i+1);
	}
	
	 static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 

}
