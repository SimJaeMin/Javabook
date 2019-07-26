package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Ex1_FileInputStreamDemo */
// FileInputStream : ����(��ġ) ���� ���� �����ؼ� ����ϴ� Stream
// 1�� ��Ʈ�� : ��ġ ���� ���� �����ؼ� ����ϴ� Stream
public class Ex1_FileInputStreamDemo {

    public static void main(String[] args) {
        String path = "C:\\kosta188\\demo\\message.txt";
        // ���������� ���� �� �ʱ�ȭ
        // 1�� ��Ʈ��, ����Ʈ ��Ʈ�� 
        // try�� scope���� ������ �����ϴ� ������ ���� �غ��ô�.
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path); //����
            int rdv = 0;
            //������ ���������� ���� EOF(������ ��)���� �о���̴�
            //�ݺ��� , read(): 1byte�� �о���� �޼��� ,�� -1�� ��ȯ
            while((rdv = fis.read()) != -1){
                System.out.print((char)rdv);
            }
          // ������ ������ �߻��Ǵ� �����̴�.
        } catch (FileNotFoundException ex) {
            System.out.println("������ �������� ���� ���!");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("�о� ���̴� ����");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
