package ex1;
/* Ex2_MyThread */
public class Ex2_MyThread extends Thread{
    private int value;
    @Override
    public void run() {
         int i = 0;
        // ���� �������� �̸� 
        String name = getName();
        while(i < 3){
            System.out.println(name+",�������� i �� :"+(++i));
            System.out.println(name+",����ʵ� value �� :"+(++value));
            System.out.println("Thread Active Cnt :"+Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        Ex2_MyThread t1 = new Ex2_MyThread();
        Ex2_MyThread t2 = new Ex2_MyThread();
        t1.start();
        t2.start();
    }
}
