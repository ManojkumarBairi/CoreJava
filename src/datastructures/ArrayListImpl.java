package datastructures;

public class ArrayListImpl {

	private static Object arrayList[];
	private static int size;
	
	public ArrayListImpl()
	{
		arrayList=new Object[10];
		size=arrayList.length;
		System.out.println(size);
	}
	public ArrayListImpl(int initialCapacity)
	{
		arrayList=new Object[initialCapacity];
		size=arrayList.length;
	}
	
	public Object  get(int index)
	{
		if(index<0 || index>size)
		{
			throw new IndexOutOfBoundsException();
		}

		return arrayList[index];
	}
	
	
	public Object set(int index,Object O)
	{
		Object Old=get(index);
		arrayList[index]=O;
		return Old;
	}
	
	public int indexOf(Object O)
	{
		for(int i=0;i<size;i++)
		{
		Object temp=arrayList[i];
		if(equals(O,temp))
		{
			return i;
		}
		}
		return -1;
		
	}
	
	public boolean equals(Object target,Object element)
	{
		if(target==null)
		{
			return element==null;
		}else {
		return target.equals(element);
		}
	}
	public Object remove(int index) {
		Object element = get(index);
		for (int i=index; i<size-1; i++) {
			arrayList[i] = arrayList[i+1];
		}
		size--;
		return element;
		}
	
	public boolean add(Object element) {
		if (size >= arrayList.length) {
		// make a bigger array and copy over the elements
			Object[] bigger = (Object[]) new Object[arrayList.length * 2];
		System.arraycopy(arrayList, 0, bigger, 0, arrayList.length);
		arrayList = bigger;
		}
		arrayList[size] = element;
		size++;
		return true;
		}
	public static void main(String[] args) {
		ArrayListImpl array=new ArrayListImpl();
		array.add("One");
		array.add("TWO");
		array.add("Three");
		array.add("FOur");
		System.out.println(array.size);
		System.out.println(array.get(2));
	}

}
