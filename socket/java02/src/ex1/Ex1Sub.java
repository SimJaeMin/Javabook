/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author bit
 */
public class Ex1Sub extends Ex1_Ex1_Super {
    public Ex1Sub(){
        System.out.println("�ڽ�ũ���� ������ ȣ��");
        
    }
    public void subTest(){
        supertest();
    }
    public static void main(String[] args) {
        Ex1Sub e1 = new Ex1Sub();
        e1.subTest();
 
    }
}
