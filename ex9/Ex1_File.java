/* Ex1_File */
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_File {
    public static void main(String[] args) {
        //ù��° ���
        String path = "C:\\kosta188\\demo\\demo.txt";
        //���� ��ü�� ����
        File f = new File(path);
        //�ֿ� �޼ҵ� ����
        System.out.println("demo1.txt�� �����ϴ°�?"+f.exists());
        if(f.exists()){
            System.out.println("��������");
        }
        System.out.println("demo1.txt�� �����ΰ�?"+f.isFile());
        System.out.println("������ �����Ѱ�?"+f.canExecute());
        System.out.println("�ۼ��� �����Ѱ�?"+f.canWrite());
        System.out.println("������"+f.getAbsolutePath());
        System.out.println("���� �̸�"+f.getName());
        System.out.println("���丮��?"+f.isDirectory());
        System.out.println("������ ����"+f.length());
        
        //�ι�° ���
        //��� �������� �ʾƵ� �����ȳ���.
        File f2 = new File("C:\\kosta188\\demo\\aa2.txt");
        if(!f2.exists()){ // ������ �������� ���� ��
            try {
                System.out.println("���� aa�� ����ڽ��ϴ�.");
               //0byte¥�� ������ ����� �ش�. unix���� touch��ɾ� ���� 
                f2.createNewFile(); // ���ο� ������ �����.
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{ 
            System.out.println("�̹����� �մϴ�.");
        }
        
        
        
        //f3�̶� ���ϰ�ü��
        //C:\\kosta188\\demo\\works\\work1������ �ѹ��� �����ʹ�.
        //mkdirs - �߻����� ���� ���丮���� ����
        File f3 = new File("C:\\kosta188\\demo\\works\\work1");
        if(!f3.exists()){
            f3.mkdirs();
        }else{
            System.out.println("�̹� ���� �մϴ�."+f3.getAbsolutePath());
        }
        
    }
}
