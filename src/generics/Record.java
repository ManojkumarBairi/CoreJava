package generics;


import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class Record<E> {
private List<E> record;
Record()
{
	this.record=new ArrayList<E>();
}
public E  add(int index,E e)
{
record.add(index, e);
return e;
}

public E get(int index)
{
	return record.get(index);
	
}

public void showObjectType()
{
	String name=((Class<E>)((ParameterizedType) getClass().
			getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
	System.out.println(name);
}
}
