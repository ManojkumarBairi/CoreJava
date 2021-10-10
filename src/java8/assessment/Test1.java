package java8.assessment;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
	/*	ArrayList<String> stringList = new ArrayList<>();
		stringList.add("first");*/
		int[] ids; 
		int[] marks; 
		try {
			ids = new int[10];
			marks = new int[-10];	// line 1
			ids[10] = 111;
			marks[10] = 100;
		}
		catch(ArrayIndexOutOfBoundsException  | NegativeArraySizeException exc2) {	// line 2
			// Statements that handle the exception
			System.out.println("cathc : "+ exc2);
		}

	}

}
