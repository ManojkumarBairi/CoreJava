package javalangFeatures;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOQ {

	public static void main(String[] args)throws IOException {
		FileOutputStream fos=new FileOutputStream("E:/output.txt");
		String data = "Learning ";
		fos.write(data.getBytes());
		fos.close();
		fos = new FileOutputStream("E:/output.txt");
		data = "Java is really fun!";
		fos.write(data.getBytes());
		fos.close();

	}

}
