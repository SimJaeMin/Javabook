package ex1;
/* CarMain */
public class CarMain {
    public static void main(String[] args) {
        // ���� , �Һ� ��ü�� �����ؼ� ������� ���� ���� 
        Car_MT cm = new Car_MT();
        Producer producer = new Producer(cm);
        Customer customer = new Customer(cm);
        
        Thread t1 = new Thread(producer,"CarMaker");
        Thread t2 = new Thread(customer,"Customer");
        t1.setDaemon(true); // ���ο� ���ӵ� Daemon
        t1.start();
        t2.start();
    }
}
