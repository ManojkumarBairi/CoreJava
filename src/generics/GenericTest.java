package generics;

public class GenericTest {

	public static void main(String[] args) {
		Student s=new Student("manoj","123","extc");
		Student s1=new Student("kumar","325","comps");
		Record<Student>r=new Record<Student>();
		r.add(0, s);
		r.add(1,s1);
		
		//r.showObjectType();
		GenericMethod.getRecordsData(r);
		
		Record<Integer> r1=new Record<Integer>();
		r1.add(0, 10);
		r1.add(1, 250);
		GenericMethod.<Integer>getRecordsData(r1);
		
	}

}
