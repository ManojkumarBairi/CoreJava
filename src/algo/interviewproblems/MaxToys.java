package algo.interviewproblems;

public class MaxToys {

	public static void main(String[] args) {
		int[] prices= {1,12,5,111,200,1000,10};
		int k=50;
		int max=maximumToys(prices,k);
		System.out.println(max);
	}
	static int maximumToys(int[] prices, int k) {
		//firt=st sort the prices of toys
		        int n=prices.length;
		        int maxtoys=0;
		        for(int i=0;i<n-1;i++)
		        {
		            for(int j=0;j<n-i-1;j++)
		            {if(prices[j]>prices[j+1])
		            {
		                int temp=prices[j];
		                prices[j]=prices[j+1];
		                prices[j+1]=temp;
		            }
		                
		            }
		        }
		        int sum=0;
		        for(int i=0;i<n;i++)
		        {
		             sum=sum+prices[i];
		            if(sum==k)
		            {
		                return i+1;
		            }
		            else if(sum<k && i!=n-1)
		            {
		                int temp=sum+prices[i+1];
		                if(temp>=k)
		                {
		                   return i+1; 
		                }
		            }
		        }
		return -1;
		    }
}
