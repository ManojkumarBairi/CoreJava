package javalangFeatures;

import java.util.ArrayList;
import java.util.List;

public class MyListGeneric<T extends Number> {
private List<T> values= new ArrayList<>();
public void add(T value)
{
	values.add(value);
}
public void remove(T value)
{
	values.remove(value);
}

public T get(int index)
{
	return values.get(index);
}
	public static void main(String[] args) {
		MyListGeneric<Float> ml=new MyListGeneric<>();
		ml.add(98.7f);
		//ml.add(1009);

	}

}
