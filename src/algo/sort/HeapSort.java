package algo.sort;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {12, 34, 54, 2, 3}; 
        System.out.println("Array before Bubble sorting"); 
        printArray(arr); 
  
        
        heapsort(arr); 
  
        System.out.println("Array after bubble sorting"); 
        printArray(arr); 


	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
	private static void heapsort(int arr[])
	{
	
	}
}
