package arrays;

public class DeltaEncoding {

	public static void main(String[] args) {
		int a[]= {25626,25757,24367,24267,16,100,2,7277};
		deltaenco(a);
		 printArray(a); 

	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }
	
	private static void deltaenco(int arr[])
	{
		Long c=1111L;
		
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int temp2=arr[i-1];
			arr[i]=arr[i]-temp2;
	}
	}
	
}
