package ex01;

public class Thread01 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName());
		}
	}
	public static void main(String[] args) {
		Thread01 t1 = new Thread01();
		t1.start();
		t1=new Thread01(); // ����� ���������
		t1.start(); // �������� life style �� �����µ� �ٽ� �ϸ� ���������� �ٽ� �������ְ� �ؾ���
		
	
}
}
