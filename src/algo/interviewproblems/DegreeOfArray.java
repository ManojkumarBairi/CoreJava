package algo.interviewproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class DegreeOfArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		printArray(arr);
		
		System.out.println("Invokingdegree of array");
		int result = degreeOfArray(arr);
		System.out.println(result);
	}
	 public static int degreeOfArray(List<Integer> arr) {
		    int n=arr.size();
		    int range=1000000;
		  int degree=  countingsort(arr,range);
		    System.out.println("final result");
		  //  printArray(arr);
		    
return degree;
		    }
	 
	 private static int countingsort(List<Integer> arr,Integer range)
		{
		 List<Integer> arrcount = new ArrayList<>(range);
		 
		 System.out.println(arrcount.size());
		 for (int i = 0; i < range; i++) {
			 arrcount.add(0);
			}
			for(int i=0;i<arr.size();i++)
			{
				int temp=arr.get(i);
			//	arrcount.get(temp)=arrcount.get(temp)+1;
				int x=arrcount.get(temp);
				arrcount.set(temp, x+1);
			}
			printArray(arrcount);
			System.out.println("after modification");
			for(int i=1;i<arrcount.size();i++)
			{
				
				//arrcount[i]=arrcount[i]+arrcount[i-1];
				arrcount.set(i,arrcount.get(i)+arrcount.get(i-1));

			}
			printArray(arrcount);
			int x=arr.size();
			//int[] copyarr=new int[x];
			List<Integer> copyarr = new ArrayList<>(x);
			for (int i = 0; i < x; i++) {
				copyarr.add(0);
				}
			for(int i=0;i<arr.size();i++)
			{
				int temp=arr.get(i);
				int position=arrcount.get(temp);
				//copyarr[position-1]=temp;
				copyarr.set(position-1, temp);
				//arrcount[temp]=arrcount[temp]-1;
				arrcount.set(temp, arrcount.get(temp)-1);
			}
			System.out.println("after count sort");
			printArray(copyarr);
			int maxcount=0;
			TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>();
			for(int i=0;i<copyarr.size();i++)
			{
				int first=copyarr.get(i);
				int countforFirst=0;
				for(int j=i+1;j<copyarr.size();j++)
				{
					int second=copyarr.get(j);
					if(first==second)
					{
						countforFirst++;
					}
					else
					{
						//((List<Integer>) tree).add(first,countforFirst);
						tree.put(first, countforFirst);
						break;
					}
				}
				
			}
			System.out.println(tree.keySet());
			return maxcount;
		}
	 static void printArray(List<Integer> arr) 
	    { 
	        int n = arr.size(); 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr.get(i)+" "); 
	        System.out.println(); 
	    } 
}
