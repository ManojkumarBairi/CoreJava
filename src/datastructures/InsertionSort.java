package datastructures;

import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(12);
		arr.add(41);
		arr.add(18);
		arr.add(20);
		arr.add(55);
		arr.add(98);
		arr.add(75);
		arr.add(85);
		arr.add(63);
		arr.add(88);
		System.out.println(arr.size());
		for(Integer i:arr)
		{
			System.out.print(i+" ");
		}
		insertsort(arr);
		System.out.println(arr.size());
		for(Integer i:arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void insertsort(ArrayList<Integer> arr)
	{
		int i=1;
		int j=0;
		while(i<arr.size())
		{
			j=i;
			while(j>0 && (arr.get(j-1)>arr.get(j))) 
			{
				int temp=arr.get(j);
				arr.set(j, arr.get(j-1));
				arr.set(j-1, temp);
				j=j-1;
			}
			i=i+1;
		}
	}
}
