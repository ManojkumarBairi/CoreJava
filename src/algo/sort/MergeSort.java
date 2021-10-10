package algo.sort;

public class MergeSort {

	public static void main(String[] args) {
		int A[]= {2,4,5,7,1,9,3,8,6};
		int r=A.length;
		mergesort(A,0,r-1);
		for(int i:A)
		{
			System.out.print(i+" ");
		}

	}

	private static void mergesort(int A[],int p,int r) {
	if(p<r)
	{
		int q=(p+r)/2;
		mergesort(A,p,q);
		mergesort(A,q+1,r);
		merge(A,p,q,r);
	}
	}
	
	private static void merge(int A[],int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int[] Left=new int[n1];
		int[] Right=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			Left[i]=A[p+i];
		}
			for(int j=0;j<n2;j++)
			{
				Right[j]=A[q+1+j];
			}
		int i=0;
		int j =0;
		
		/*for (int k=p;k<=r;k++)
		{*/
		int k=p;
		while(i<n1 && j<n2)
			{
			if(Left[i]<=Right[j])
			{
				A[k]=Left[i];
				i=i+1;
				
			}
			else
			{
				A[k]=Right[j];
				j=j+1;
			}
			k++;
			}
		/* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
        	A[k]=Left[i];
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
        	A[k]=Right[j];
            j++; 
            k++; 
        } 
		}
	

}
