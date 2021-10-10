package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	Cat c = new Cat();
}
class Cat implements Serializable{
	Rat r = new Rat();
}
class Rat implements Serializable{
//class Rat {
	int j = 20;
}
public class ObjectGraphTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1=new Dog();
		
		FileOutputStream fos=new FileOutputStream("cat.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		               oos.writeObject(d1);
		               
		          FileInputStream fis=new FileInputStream("cat.ser");
		          ObjectInputStream ois=new ObjectInputStream(fis);
		         Dog d2=(Dog)ois.readObject();
		         System.out.println("output");
		System.out.println(d2.c.r.j);//20


	}

}
