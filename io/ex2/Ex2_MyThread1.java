package ex1;
/* Ex2_MyThread */
public class Ex2_MyThread1 extends Thread{
   // private int value;
    private Ex2_MyData data;
    public Ex2_MyThread1(Ex2_MyData data) {
        this.data = data;
    }
    @Override
    public void run() {
         int i = 0;
        // ���� �������� �̸� 
        String name = getName();
        while(i < 3){
            System.out.println(name+",�������� i �� :"+(++i));
            System.out.println(name+",����ʵ� value �� :"+(data.getValue()));
            System.out.println("Thread Active Cnt :"+Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        Ex2_MyData ref = new Ex2_MyData();
        Ex2_MyThread1 t1 = new Ex2_MyThread1(ref);
        Ex2_MyThread1 t2 = new Ex2_MyThread1(ref);
        t1.start();
        t2.start();
    }
}
