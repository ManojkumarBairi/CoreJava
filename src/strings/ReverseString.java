package strings;


//there are total 5 ways
public class ReverseString {

	public static void main(String[] args) {
		String s="manojkumar";
		
		//
		String s1=ReverseString.reverse(s);
		System.out.println(s1);

	}
public static String reverse(String s)
{
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
	return s1;
}
}
