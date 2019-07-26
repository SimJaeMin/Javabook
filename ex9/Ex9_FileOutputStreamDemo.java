package Ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex9_FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String path="d\\javabokk\\demo\\message.txt";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
			fos.write(66);
			fos.write(65);
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}finally {
			if(fos!=null) fos.close();
		}
	}
}
