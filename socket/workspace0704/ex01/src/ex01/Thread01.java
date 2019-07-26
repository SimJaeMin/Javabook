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
		t1=new Thread01(); // 재생성 을해줘야함
		t1.start(); // 쓰레드의 life style 가 끝났는데 다시 하면 오류가난다 다시 생성해주고 해야함
		
	
}
}
