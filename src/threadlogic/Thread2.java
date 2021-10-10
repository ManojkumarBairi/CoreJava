package threadlogic;

public class Thread2 implements Runnable{
public void run()
{
	for(int i=0;i<4;i++)
{
	System.out.println("Thread2 run method"+i);
}
}

public static void main(String args[])
{
	Thread2 t2 =new Thread2();
	Thread t=new Thread(t2);
	t.start();
	System.out.println(Thread.currentThread().getName());
	t.setName("manojthread");
	System.out.println(t.getName());
	System.out.println(t.getPriority());
	for(int i=0;i<4;i++)

{
	System.out.println("main method  method"+i);
}
}
}
