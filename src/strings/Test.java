package strings;

 
class Test{
	public static void main(String[] args) {
		Immutable x=Immutable.createNewInstance(10);
		System.out.println(x.geti());

		trymodification(x.geti());
		System.out.println(x.geti());
	}
private static void trymodification(Integer i)
{
	i=10000;//still the value does not changed
}
}
