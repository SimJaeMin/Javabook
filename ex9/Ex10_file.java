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
        //바이트 스트림 선언
//        FileInputStreamputStream fis = null;
//
//        FileOutputStreamutStream fos = null;
        //2차 스트림을 선언 : 버퍼 기능을 갖춘 2차 스트림
        	BufferedInputStream bis=null;
        	BufferedOutputStream bos = null;
        	

        try {

            //fis = new FileInputStream(path1);

            //fos = new FileOutputStream(path2);
            //fis.read() : 1바이트식 읽어 들이는 메서드
            // 마지막 -1을 반환한다.
        	
        	bis=new BufferedInputStream(new FileInputStream(path1));// 안에 1차가 들어감
        	bos= new BufferedOutputStream(new FileOutputStream(path2));
            int readV = 0;

//            while((readV = fis.read()) != -1){
//            	// 읽어 들인 내용을 사본 파일에 저장한다.
//                fos.write(readV);
//
//            }

            while((readV = bis.read()) != -1){
            	// 읽어 들인 내용을 사본 파일에 저장한다.
                bos.write(readV);

            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally{ // 자원을 해지한다.
//
//           if(fis != null) fis.close();
//
//           if(fos != null) fos.close();

        	//bis로 부터 버퍼에 담아 읽어 들이면서 bos로 읽어온 경로로 버퍼 단위로 저장한다.
        	// 2차는 이미지나 영상처리에서 사용한다. 문자열을 사용할 떄는 안쓴다.
            if(bis != null) bis.close();

            if(bos != null) bos.close();

        }

        long end = System.currentTimeMillis();

        System.out.println("복사한 시간 :"+(end - start));

    }
}
