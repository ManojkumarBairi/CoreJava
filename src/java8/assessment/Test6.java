package java8.assessment;

import java.util.Arrays;
import java.util.stream.Stream;

interface Calculator {
	public double calculate(double x, double y);
}

public class Test6 {

	public static void main(String[] args) {
		Calculator add=(double x,double y)->{return x+y;};
		Calculator sub=( x, y)->{return x-y;};
		Calculator multiple=( x, y)->x*y;
System.out.println(add.toString());
String arr [] = {"Test" , "Java8" , "Features"};
Stream s=(Stream) Arrays.stream(arr);
}
	}


