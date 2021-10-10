package algo.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {2,7,4,9,24,65,78,33,54,102,0,6,56,88};
		int x=65;
int index=linearsearch(x,arr);
System.out.println(index);
	}
	//time complexity is O(n)
public static int linearsearch(int x,int[] arr)
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		if(x==arr[i]){
			return i;
		}
	}
	return -1;
}
}
