package strings;
//Swap 2 string without third variable;
public class StringSwap {

	public static void main(String[] args) {
		String s1="manoj";
		String s2="kumar";
		
		s1=s1+s2;
		System.out.println(s1);
		
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println(s2);
		
		s1=s1.substring(s2.length(), s1.length());//or s1=s1.substring(s2.length());
		System.out.println(s1);
	}

}
