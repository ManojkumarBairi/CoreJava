package dassault;

import java.util.List;

public class Question1 {

	public void display(String s) {
		System.out.println("String method");
	}
	public void display(List lst) {
		System.out.println("List method");
	}
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		//q1.display(null);
	}

}
