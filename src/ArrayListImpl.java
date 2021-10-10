import java.util.ArrayList;

public class ArrayListImpl {
public static void main(String args[])
{
	ArrayList arr=new ArrayList(1);
	arr.add("asa");
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	arr.add("asad");
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	arr.trimToSize();
	
}
}
