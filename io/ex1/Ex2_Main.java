package ex1;
/* Ex2_Main 
   스레드는 순서가 없고, 실행 되는 시점이 명확하지 않다.
*/
public class Ex2_Main {
    public static void main(String[] args) {
        Ex2_MyThread1 em = new Ex2_MyThread1();
        em.start();
        // 스레드는 생명주기가 있어서 두번 start를 호출할 수 없다.
        // em.start();
        Thread t1 = new Thread(new Ex2_MyRunnable1());
        t1.start();
        for(int i=0; i<10; i++){
            System.out.print(i+"\t");
        }
        
    }
}
