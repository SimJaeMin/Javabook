package ex1;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


/* Ex5_Demo 
Scanner �� ����ϸ� ���ὺƮ���� ���̵�
�ٷ� ����Ʈ��Ʈ���� ���� ��Ʈ������ �о� �� �� �ִ�.
=> nextLine()���� �о� ���� ����
�ݴ�� Ű������ ���� ���ٴ����� �о� �;� �Ѵٸ� ..Scanner
BufferedReader br = new BufferedReader(System.in) 
=> ���� �ʿ��ұ��? 
*/
public class Ex5_ScannerDemo {
    public static void main(String[] args) throws MalformedURLException {
        String path = "http://edu2.kosta.or.kr/lectures/search?searchText=Mybatis";
        URL url = new URL(path);
        try(Scanner sc = new Scanner(
                new BufferedInputStream(url.openStream()),"utf-8")){
            String rdv = null;
            while (sc.hasNext()) {                
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
