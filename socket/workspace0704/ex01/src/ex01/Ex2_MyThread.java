package ex01;

public class Ex2_MyThread extends Thread{
	 	My_Data a=new My_Data();
	    @Override

	    public void run() {

	         int i = 0;

	        // 현재 스레드의 이름 

	        String name = getName();

	        while(i < 3){

	            System.out.println(name+",지역변수 i 값 :"+(++i));

	            System.out.println(name+",멤버필드 value 값 :"+(a.getValue()));

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
