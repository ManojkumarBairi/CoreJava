package java8prog1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String s1="!@#$-Infosys";
		System.out.println(s1.matches("([^\\W]+)-[Infosys]+"));

	}

}
