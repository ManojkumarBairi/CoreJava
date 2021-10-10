package java8prog1;

public class StringTester {

	public static void main(String[] args) {
		String s1 = "Alpha", s2 = "Beta", s3 = "Theta";
		s1.toLowerCase();
		s3.replace("Beta", "Alpha");
		System.out.print((s1.equals(s2)) + "," + (s2.equals(s3)));
	}
}
