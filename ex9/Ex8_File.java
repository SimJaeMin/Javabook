package Ex01;

import java.io.File;
import java.io.IOException;

public class Ex8_File {
	public static void main(String[] args) {
		
	
	File f2 = new File("D:\\javabook\\demo\\aa2.txt");
	if(!f2.exists()) {
		try {
			f2.createNewFile();	
		} catch (IOException ex) { //����� ����.���� ���ÿ��� ������ �޼����� ���!
			ex.printStackTrace();
			// TODO: handle exception
		}
		
	}
	File f3 = new File("d:\\javabook\\demo\\works\\work1");
	if(!f3.exists()) {
		f3.mkdirs();
		System.out.println("Path :"+f3.getPath());
		
	}else {
		System.out.println("�̹� �����մϴ�."+f3.getAbsolutePath());
	}
	

	}
}
