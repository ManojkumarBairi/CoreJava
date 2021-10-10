package java8prog1;

public class DistinctStrings {
	public static void main(String[] args) {
		String s1 = "Bharath";
		String s2 = "rath";
		String s3 = "Bha" + s2;
		System.out.println(s3);
		String s4 = "Bha" + "rath";
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s3));
	}
}
