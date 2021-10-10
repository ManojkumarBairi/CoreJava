package generics;

public class GenericMethod {

	/*public static void main(String[] args) {
	

	}*/

	public static <E> void getRecordsData(Record<E> r) {
		
		System.out.println(r.toString());
	}

}
