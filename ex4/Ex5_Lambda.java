package ex4;
/* Ex5_Lamba */
public class Ex5_Lambda {
    public static void main(String[] args) {
        // �͸� ���� Ŭ���� 
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");
            }
        };
        myInter.myMethod();
        System.out.println("--------------------------");
        // �Ű������� ���ϰ��� ����void �ϰ�� ���ٽ�
        MyInter myInter1 =()->{
             System.out.println("MyTest1");
        };
        myInter1.myMethod();
    }
}
