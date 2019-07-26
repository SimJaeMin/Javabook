package Ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10_file {
	public static void main(String[] args) throws IOException, IOException {

        long start = System.currentTimeMillis();

        String path1 = "d:\\javabook\\demo\\jdk.exe";

        String path2 = "d:\\javabook\\demo\\myjdk.exe";
        //����Ʈ ��Ʈ�� ����
//        FileInputStreamputStream fis = null;
//
//        FileOutputStreamutStream fos = null;
        //2�� ��Ʈ���� ���� : ���� ����� ���� 2�� ��Ʈ��
        	BufferedInputStream bis=null;
        	BufferedOutputStream bos = null;
        	

        try {

            //fis = new FileInputStream(path1);

            //fos = new FileOutputStream(path2);
            //fis.read() : 1����Ʈ�� �о� ���̴� �޼���
            // ������ -1�� ��ȯ�Ѵ�.
        	
        	bis=new BufferedInputStream(new FileInputStream(path1));// �ȿ� 1���� ��
        	bos= new BufferedOutputStream(new FileOutputStream(path2));
            int readV = 0;

//            while((readV = fis.read()) != -1){
//            	// �о� ���� ������ �纻 ���Ͽ� �����Ѵ�.
//                fos.write(readV);
//
//            }

            while((readV = bis.read()) != -1){
            	// �о� ���� ������ �纻 ���Ͽ� �����Ѵ�.
                bos.write(readV);

            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally{ // �ڿ��� �����Ѵ�.
//
//           if(fis != null) fis.close();
//
//           if(fos != null) fos.close();

        	//bis�� ���� ���ۿ� ��� �о� ���̸鼭 bos�� �о�� ��η� ���� ������ �����Ѵ�.
        	// 2���� �̹����� ����ó������ ����Ѵ�. ���ڿ��� ����� ���� �Ⱦ���.
            if(bis != null) bis.close();

            if(bos != null) bos.close();

        }

        long end = System.currentTimeMillis();

        System.out.println("������ �ð� :"+(end - start));

    }
}
