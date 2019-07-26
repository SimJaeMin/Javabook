package ex1;
/* Ex2_MyThread1 */
public class Ex2_MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("^---^"+getName());
    }
    
}
