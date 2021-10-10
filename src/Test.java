public class Test {

	public static void main(String[] args) {
int n=9;
int[] arr={10,20,20,10,10,30,50,10,20};
int count=0;
outer:for(int i=0;i<arr.length;i++)
{
	int a1=arr[i];
	if(arr[i]==0)
		continue outer;
	for(int j=i+1;j<arr.length;j++)
	{
		int a2=arr[j];
		if(a1==a2)
		{
			count=count+1;
			arr[j]=0;
			continue outer;
			
		}
	}
}
System.out.println(count);
}
}

	