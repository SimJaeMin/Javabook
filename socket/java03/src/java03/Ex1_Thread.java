package java03;

public class Ex1_Thread implements Runnable{
	private int value;

	@Override//동기화
	public synchronized void run() {
		// TODO Auto-generated method stub
		int i = 0;
		//현재 스래드의 이름
		
		String name = Thread.currentThread().getName();
		
		synchronized(this) { //동기화 블록, this는 현재 주소
			while(i<3) {
				System.out.println(name + ",지역변수 i 값 :"+(++i));
				System.out.println(name + ",맴버필드 value 값 : "+ (++value));
				System.out.println("Tread Active Cnt : "+Thread.activeCount());
			}
		}
	}
	
	public static void main(String[] args) {
		//runnable을 구현한 클래스의 주소를 thread의 생성자로 전달해서
		//start()를 호출 할수 있다
		Ex1_Thread r = new Ex1_Thread();
		new Thread(r).start();
		new Thread(r).start();
	}
	
}
