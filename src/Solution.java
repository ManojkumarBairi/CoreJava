import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {

    // Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long a=0;
	
		if(s.contains("a"))
		{
		
		if(s.length()==1)
		{
			return n;
		}
		System.out.println(s);      


		while(s.length()<=n)
		{
			s=s+s;
		}
		System.out.println(s);
		s=s.substring(0,(int)n);
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				a++; 
			}
		}
		}
		return a;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  /*      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/
String s ="x";
long n=970770;
        long result = repeatedString(s, n);
        System.out.println(result);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}
