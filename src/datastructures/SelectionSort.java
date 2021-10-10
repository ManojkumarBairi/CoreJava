package datastructures;

public class SelectionSort {

	
	
	public static void main(String[] args) {
	int arr[]= {12,19,15,21};
	for(int i:arr)
	{
	System.out.print(i+" ");
	}
	selectionsort(arr);
	
	System.out.println("");
	for(int i:arr)
	{
	System.out.print(i+" ");
	}
	}

	
	public static void selectionsort(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			int j=indexLowest(array,i);
			swapElements(array,i,j);
		}
	}
	
	
	public static int indexLowest(int array[],int start)
	{
		int lowIndex=start;
		for(int i=start;i<array.length;i++)
		{
			if(array[i]<array[lowIndex])
			{
				lowIndex=i;
			}
		}
		return lowIndex;
	}
	
	public static void swapElements(int array[],int i,int j)
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}
