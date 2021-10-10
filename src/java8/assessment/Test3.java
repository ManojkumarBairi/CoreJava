package java8.assessment;
interface WithDefinition {
	default void print() {
		System.out.println("default method");
	}
}

class WithDefinitionImpl implements WithDefinition {
	void callPrint() {
		print();
	}
}
public class Test3 {

	public static void main(String[] args) {
		
		WithDefinitionImpl impl = new WithDefinitionImpl();
		impl.callPrint();
	}

}
