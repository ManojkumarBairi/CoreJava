package java8.assessment;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan;
		//check error at line 1
		//try(scan = new Scanner(System.in)) {	// line 1
		try {
			// Input getting using Scanner
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			//scan.close();	// line 2
		}

	}

}
