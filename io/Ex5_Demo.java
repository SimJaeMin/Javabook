package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Ex5_Demo */
public class Ex5_Demo {
    public static void main(String[] args) throws MalformedURLException {
        BufferedReader br =null;
        try {
            String path ="http://edu2.kosta.or.kr/lectures/search?searchText=Mybatis";
            URL url = new URL(path);
            // ��¿�� ���� ����Ʈ��Ʈ������ �޾ƿ� ��ü��
            // ���ڽ�Ʈ������ �����Ϸ��� �Ҷ��� �ִ�.
            // InputStreamReader(inputstream,���ڵ�)
            // => Scanner�� ��ü �����ϴ�. (InputStreamReader x)
            // �������� : Scanner�� API �����ؼ� 
            // �Ȱ��� ������� Ex5_ScannerDemo���� �����Ͻÿ�.
            br = new BufferedReader(
                    new InputStreamReader(url.openStream(),"utf-8"));
             String str = null;
            while ((str = br.readLine()) != null) {                
                System.out.println(str);
            }
        } catch (IOException ex) {
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Ex5_Demo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
