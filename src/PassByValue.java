class Foo{
	private String attribute ;
	
	public Foo(String a)
	{
		this.attribute=a;
	}
	
	public String getattribute()
	{
		return attribute;
	}
	
	public void setattribute(String a) {
		this.attribute=a;
	}
}
public class PassByValue {

	public static void main(String[] args) {
		Foo f=new Foo("manoj");
		System.out.println(f.getattribute());
		changereference(f);//will not change the value since it is pass by value not reference
		System.out.println(f.getattribute());
		modifyvalue(f);
		System.out.println(f.getattribute());

	}
	
	private static void  changereference(Foo a)
	{
		Foo b =new Foo("kumar");
		a=b;//here a is pointing to location of b not f
	}
private static void modifyvalue(Foo b)
{
	b.setattribute("bairi");//since b and f points to the same referecne then both teh values change
}
}
