package datastructures;

public class StackImpl {
int top;
int max=1000;
int[] arr= new int[max];

StackImpl() {
	top=-1;
}
public boolean push(int x)
{
	if(top>=max)
	{
		return false;
	}
	else
	{
		arr[++top]=x;
		System.out.println("push success "+x+" top: "+ top);
		return true;
	}
}

public int pop()
{
	return arr[top--]; 
}

public static void main(String[] args) {
	StackImpl s=new StackImpl();
	s.push(10);
	s.push(20);
	s.push(30);
	System.out.println(s.pop());
	s.push(40);
	s.push(50);
	System.out.println(s.pop());
}

}
