package java03;

public class Ex1_Thread implements Runnable{
	private int value;

	@Override//����ȭ
	public synchronized void run() {
		// TODO Auto-generated method stub
		int i = 0;
		//���� �������� �̸�
		
		String name = Thread.currentThread().getName();
		
		synchronized(this) { //����ȭ ���, this�� ���� �ּ�
			while(i<3) {
				System.out.println(name + ",�������� i �� :"+(++i));
				System.out.println(name + ",�ɹ��ʵ� value �� : "+ (++value));
				System.out.println("Tread Active Cnt : "+Thread.activeCount());
			}
		}
	}
	
	public static void main(String[] args) {
		//runnable�� ������ Ŭ������ �ּҸ� thread�� �����ڷ� �����ؼ�
		//start()�� ȣ�� �Ҽ� �ִ�
		Ex1_Thread r = new Ex1_Thread();
		new Thread(r).start();
		new Thread(r).start();
	}
	
}
