
package ex2;

import java.util.Scanner;

public class Ex10_IfElseIf {
    public static void main(String[] args) {
        // 50 �̻� ��� 30�̻� �߱� 20�̻� �ʱ� ������ ��� ����
        int score = 50;
        String grade="";
        if(score >=50){
            grade = "���";
        }else if(score >=30){
            grade = "�߱�";
        }else if(score >=20){
            grade = "�ʱ�";
        }else{
            grade = "����";
        }
        System.out.println("����: "+score+"\n���: "+grade);
    }
}
