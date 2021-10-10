package javalangFeatures;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee{
	String name;
}

public class ContractEmployee extends Employee{
int salary;
ContractEmployee(int salary, String name) {
	super.name = name;
	this.salary = salary;
}

public String toString() {
	return super.name + salary;
}
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		ContractEmployee cemp = new ContractEmployee(10000, "Sam");
		FileOutputStream fos = new FileOutputStream("E:/serial.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cemp);

		FileInputStream fis = new FileInputStream("E:/serial.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		cemp = (ContractEmployee) ois.readObject();
		System.out.println(cemp);
	}

}
