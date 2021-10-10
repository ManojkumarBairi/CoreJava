
public class MergeSort {

	public   int[] merge(int a[])
	{
		int low =0;
		int high=a.length;
		if(low==high)
		{
			return a;
		}
		else
		{
			//int n=high-low;
			int m=(low+high)/2;
			int temp1size=m-low;
			int temp2size=high-m;
			int[] temp1=new int[temp1size];
			int[] temp2=new int[temp2size];
			for(int x=0;x<temp1size;++x)
			{
				temp1[x]=a[low+x];
			}
		
			for(int x=0;x<temp2size;++x)
			{
				temp2[x]=a[m+x];
			}
			System.out.println(" temp1");
			for(int z=0;z<temp1.length;z++)
			{
			System.out.print(temp1[z]+" ");
			}
			System.out.println(" ");
			System.out.println(" temp2");
			for(int z=0;z<temp2.length;z++)
			{
			System.out.print(temp2[z]+" ");
			}
			System.out.println(" ");
			merge(temp1);
			merge(temp2);
			int sorted[]=merge_sort(temp1,temp2);
			return sorted;
		}
	}
	public  int[] merge_sort(int[] temp1,int[] temp2)
	{
		int i=0;
		int j=0;
		int k=temp1.length+temp2.length;
		int sorted[]=new int[k];
		int sorti=0;
		while(i<temp1.length && j<temp2.length)
		{
			if(temp1[i]<=temp2[j])
			{
				sorted[sorti]=temp1[i];
				i++;
				
			}
			else
			{
				sorted[sorti]=temp2[j];
				j++;
			}
			sorti++;
		}
		
		while(i<temp1.length)
		{
			sorted[sorti]=temp1[i];
			i++;
			sorti++;
		}
		while(j<temp2.length)
		{
			sorted[sorti]=temp2[j];
			j++;
			sorti++;
		}
		return sorted;
	}
	public static void main(String[] args) {
	
		int a[]= {89,74,52,14,36,58,20,96};
		int n=a.length;
		System.out.println("Before sort");
		for(int z=0;z<n;z++)
		{
		System.out.print(a[z]+" ");
		}
		System.out.println(" ");
		int sorted[]=new MergeSort().merge(a);
		int m=sorted.length;
		System.out.println("After sort");
		for(int z=0;z<m;z++)
		{
		System.out.print(sorted[z]+" ");
		}
	}

}
