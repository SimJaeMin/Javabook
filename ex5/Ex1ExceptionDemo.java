
package ex5;

import java.util.Scanner;

public class Ex1ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���:");
        try {
            String  n = sc.nextLine();
            /// ������ �ƴ����� �Ǻ��ϴ� ���� 
             int num = Integer.parseInt(n);
             System.out.println("�Է°� :"+num);
        } catch (Exception e) {
            System.out.println("���ڸ� �Է��ϼ���!");
        }
        
       
    }
}
