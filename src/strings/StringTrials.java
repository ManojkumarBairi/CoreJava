package strings;

public class StringTrials {

	public static void main(String[] args) {
		String str="manoj";
		
		String str1="manoj";
		
		String s2=new String("manoj");
		String s3=new String("manoj");
		
		String s4="manoj";
		
		System.out.println(str==str1);
		System.out.println(str==s2);
		System.out.println(s3==s2);
		System.out.println(str==s3);
		System.out.println(str==s4);
		

	}

}
