package arrays;

import java.util.ArrayList;
import java.util.List;

public class Agent {

	public static void main(String[] args) {
		int X=1;
		int N=3;
		int M=2;
		
List<List<Integer>> cl=new ArrayList<>();
ArrayList<Integer> a=new ArrayList<>();
a.add(1481122000);
//ArrayList<Integer> b=new ArrayList<>();
a.add(1481122020);
//ArrayList<Integer> One=new ArrayList<>();
cl.add(a);

ArrayList<Integer> c=new ArrayList<>();
c.add(1481122000);
//ArrayList<Integer> d=new ArrayList<>();
c.add(1481122040);
cl.add(c);
ArrayList<Integer> e=new ArrayList<>();
e.add(1481122030);
//ArrayList<Integer> f=new ArrayList<>();
e.add(1481122035);
cl.add(e);
int i =howManyAgentsToAdd(X, cl);


System.out.println(i);
	}
	
	static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {
        int icount=0;
        System.out.println(callsTimes.size());
for(int i=0;i<callsTimes.size();i++)
{
    List<Integer> arr=callsTimes.get(i);
    Integer a=arr.get(0);
    Integer b=arr.get(1);
    for(int j=i+1;j<callsTimes.size();j++)
    {
      List<Integer> brr=callsTimes.get(j);
    Integer c=brr.get(0);
    Integer d=brr.get(1); 
        if((c==a) || (c>=a &&c<=b) || (d==b)||(d>=a || d<=b))
        {
            icount++;
        }
    }
}
if(noOfCurrentAgents==icount)
{
    return 0;
}
        else{
            return icount-noOfCurrentAgents;
        }
    }

}
