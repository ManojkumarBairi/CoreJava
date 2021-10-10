package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)throws IOException {
	int wordcount=0;
File f=new File("taleoftwocities.txt");
Scanner s=new Scanner(f);
		while(s.hasNextLine())
		{
			String line =s.nextLine();
			wordcount+=line.split(" ").length;
		}
		System.out.println("The file has "+wordcount+" words");
	}

}
