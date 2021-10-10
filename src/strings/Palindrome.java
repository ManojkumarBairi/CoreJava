package strings;
//Manoj without looking any code
public class Palindrome {

	public static void main(String[] args) {
		String s="MalayalaM";
		
		String s1="manojkumar";
		
		checkpalindrome(s);
		
		checkpalindrome(s1);
		String s2="refer";
		checkpalindrome(s2);
	}
private static void checkpalindrome(String x)
{
	int n=x.length()-1;
	boolean bl=true;
	outer :for(int i=0;i<n;i++)
	{
		
			if(x.charAt(i)!= x.charAt(n-i))
			{
				bl=false;
				break outer;
			}
			else
			{
				continue outer;
			}
		}
	
	if(!bl)
	System.out.println(x+ " IS not palindrome ");
	else
		System.out.println(x+ " IS  palindrome ");
}
}
