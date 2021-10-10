package algo.search;

public class InterpolationSearch {

	public static void main(String[] args) {
		int x=18;
		 int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 
                24, 33, 35, 42, 47}; 
		
		 System.out.println("to search "+x+" in array using interolation search");
		 printArray(arr);
		int index=interpolationsearch(arr,x);
				 System.out.println(" "+x+" in array at index "+index);
		 
	}
private static int interpolationsearch(int arr[],int x)
{
	// Find indexes of two corners 
    int lo = 0, hi = (arr.length - 1); 
   
    // Since array is sorted, an element present 
    // in array must be in range defined by corner 
    while (lo <= hi && x >= arr[lo] && x <= arr[hi]) 
    { 
        // Probing the position with keeping 
        // uniform distribution in mind. 
        int pos = lo + (((hi-lo) / 
              (arr[hi]-arr[lo]))*(x - arr[lo])); 
   
        // Condition of target found 
        if (arr[pos] == x) 
            return pos; 
   
        // If x is larger, x is in upper part 
        if (arr[pos] < x) 
            lo = pos + 1; 
   
        // If x is smaller, x is in the lower part 
        else
            hi = pos - 1; 
    } 
	
	return -1;
	
}

static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i]+" "); 
    System.out.println(); 
} 
}
