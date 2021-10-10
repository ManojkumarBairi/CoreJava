package java8prog1;

public class Counter {
	static int count = 0;

	Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();

	}
}