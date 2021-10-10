package algo.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {12, 34, 54, 2, 3}; 
        System.out.println("Array before selection sorting"); 
        printArray(arr); 
  
        
        selectionsort(arr); 
  
        System.out.println("Array after selection sorting"); 
        printArray(arr); 

	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
	private static void selectionsort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
