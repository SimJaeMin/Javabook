package ex1;
/* Ex1_Thread */
public class Ex1_Thread implements Runnable{
    private int value;
    @Override
    public void run() {
        int i = 0;
        // ���� �������� �̸� 
        String name = Thread.currentThread().getName();
        while(i < 3){
            System.out.println(name+",�������� i �� :"+(++i));
            System.out.println(name+",����ʵ� value �� :"+(++value));
            System.out.println("Thread Active Cnt :"+Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        // Runnable�� ������ Ŭ������ �ּҸ� Thread�� �����ڷ� �����ؼ�
        // start()�� ȣ���� �� �ִ�. (�ϱ�� �սô�.)
        Ex1_Thread r = new Ex1_Thread();
        new Thread(r).start();
        new Thread(r).start();
    }
}
