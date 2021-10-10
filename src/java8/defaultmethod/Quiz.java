package java8.defaultmethod;

interface WithDefinitions{
	default void defined()
	{
		System.out.println("inside interfaces");
	}
	
}

interface WithDefinitions2{
//	default void defined()
//	{
//		System.out.println("inside interfaces 2");
//	}
	
}

class WithDefinitionsImpl implements WithDefinitions, WithDefinitions2{
//	public void defined()
//	{
//		
//		System.out.println("inside class");
//	}
}

public class Quiz {

	public static void main(String[] args) {
		WithDefinitions w=new WithDefinitionsImpl();
		w.defined();

	}

}
