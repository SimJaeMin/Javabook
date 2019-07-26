package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Ex2_FileOutputStreamDemo */
public class Ex2_FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //������ �������� ������ 
        String path = "C:\\kosta188\\demo\\message55555.txt";
        FileOutputStream fos = null;
        try {
            // ������ �����Ѵ�.
            // �ι�° ���ڿ� , �����͸� append
            fos = new FileOutputStream(path,true);
            fos.write(66);
            fos.write(65);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally{
            if(fos  != null) fos.close();
        }
        
    }
}
