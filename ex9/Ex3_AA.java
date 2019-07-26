package Ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex3_AA {
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
		String path="D:\\javabook\\demo\\ex3_obj.txt";
		ois=new ObjectInputStream(new FileInputStream(path));
		Ex3_Member v =(Ex3_Member)ois.readObject();
		System.out.println("id:"+v.getId());
		System.out.println("name : "+v.getName());
		System.out.println("PWD : " +v.getPwd());
		System.out.println("age : "+ v.getAge());
		System.out.println("pay : "+ v.getPay());
		
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
