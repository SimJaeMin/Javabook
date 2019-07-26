package ex01;

public class Ex2_Main {
	public static void main(String[] args) {
		Ex2_MyThread1 em= new Ex2_MyThread1();
		em.start();
		Thread t1 = new Thread(new Ex2_MyRunnable1());
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println(i+"\t");
		}
	}
}
