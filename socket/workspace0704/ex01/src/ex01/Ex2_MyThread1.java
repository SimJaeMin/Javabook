package ex01;

public class Ex2_MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("^____^"+getName());
	}
	public static void main(String[] args) {
		Ex2_MyThread1 em= new Ex2_MyThread1();
	}
}
