package jvm;

public class ClassLoading {

	public static void main(String[] args) {
		ClassLoading c1=new ClassLoading();
		ClassLoading c2=new ClassLoading();
		Class c=c1.getClass();
		Class b=c2.getClass();
		//For every loaded .class file, only one object of Class is created
		System.out.println(c==b);//true

		// String class is loaded by bootstrap loader, and 
        // bootstrap loader is not Java object, hence null 
		System.out.println(String.class.getClassLoader());
		
		 // ClassLoading class is loaded by Application loader
		System.out.println(ClassLoading.class.getClassLoader());
	}

}
