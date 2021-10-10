import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
int a[]= {1,5,8,3,6,4,2};
boolean blswapped=false;
int n=a.length;
int temp=0;
for(int z=0;z<n;z++)
{
System.out.print(a[z]+" ");
}
for(int i=0;i<n-1;i++)
{
	blswapped=false;
	for(int j=0;j<n-i-1;j=j+1)
	{
		
		if(a[j]>a[j+1])
		{
			blswapped=true;
			int x=a[j];
			int y=a[j+1];
			a[j]=y;
			a[j+1]=x;
		}
		
	}
	if(!blswapped)
	{
		break;
	}
}
System.out.println("After sort");
for(int z=0;z<n;z++)
{
System.out.print(a[z]+" ");
}
	}

}
