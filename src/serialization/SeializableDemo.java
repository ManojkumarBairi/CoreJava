package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int height  =10;
	int weight = 20;
	 transient int  breed = 30;
	  static String name = "TOMMY";
	  final String colour = "blue";
	@Override
	public String toString() {
		return "Dog [height=" + height + ", weight=" + weight + ", breed=" + breed + ", colour=" + colour + "]";
	}

	 
	 
	 
}
public class SeializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d  = new Dog();
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1);
		
	}

}
