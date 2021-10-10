package algo.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {12, 34, 54, 2, 3}; 
        System.out.println("Array before Bubble sorting"); 
        printArray(arr); 
  
        
        bubblesort(arr); 
  
        System.out.println("Array after bubble sorting"); 
        printArray(arr); 

	}
	private static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
	private static void bubblesort(int arr[])
	{int i, j, temp; 
    boolean swapped; 
    int n=arr.length;
    for (i = 0; i < n - 1; i++)  
    { 
        swapped = false; 
        for (j = 0; j < n - i - 1; j++)  
        { 
            if (arr[j] > arr[j + 1])  
            { 
                // swap arr[j] and arr[j+1] 
                temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
                swapped = true; 
            } 
        } 

        // IF no two elements were  
        // swapped by inner loop, then break 
        if (swapped == false) 
            break; 
    } 
	}
}
