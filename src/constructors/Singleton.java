package constructors;
class Singletonn{
	private static  Singletonn s=null;
	
	private Singletonn()
	{
	
	}

	public static Singletonn getInstance() {
		if(null==s)
		{
			s=new Singletonn();
		}
		return s;
	}
	
}



public class Singleton {
public static void main(String args[])
{
	Singletonn s=Singletonn.getInstance();
	Singletonn s1=Singletonn.getInstance();
	Singletonn s2=Singletonn.getInstance();
	if(s==s1)
	{
		System.out.println("s and s1 same");
	}else
	{
		System.out.println("s and s1 are not same");
	}
}
}
