package javalangFeatures;

import java.util.ArrayList;
import java.util.List;

public class MyListGenericObject<Object> {
private List<Object> values=new ArrayList<>();

public void add(Object value)
{
	values.add(value);
	System.out.println(values);
}
	public static void main(String[] args) {
		MyListGenericObject<String> str=new MyListGenericObject<>();
		str.add("Good");

	}

}
