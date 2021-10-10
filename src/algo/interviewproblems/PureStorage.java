package algo.interviewproblems;

public class PureStorage {

	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int length=5;
	int diff=2;
int pairs=findpairs(arr,length,diff);
System.out.println(pairs);
	}
private static int findpairs(int[] array,int len,int diff)
{
	int i = 0, j = 1, pairs = 0;    
    while (j < len) {
     for(i=0;i<len;i++)
     {
    	      
        for (j=i+1; j < len; ++j) {
            if (array[j] == array[i] + diff) {
                pairs++;
            }
          
        }
     }
      
    }    
    return pairs;
	
}
}
