package ex4;
/* Ex3_StaticInner */
public class Ex3_StaticInner {
    int numA;
    private int numB;
    static int numC=500;
    public void test(){
        System.out.println("Test!");
    }
    public Ex3_StaticInner() {
        numA = 10; numB = 100; numC = 200;
    }
    // ����Ŭ���� �ȿ��� static �ڿ��� ������ 
    // ������ static���� Ŭ������ �����ؾ� �Ѵ�. *******
    public static class Inner {
        static int d = 10000;
        public static void printData(){
          //  System.out.println("int A:"+numA);
          //  System.out.println("int B:"+numB);
            System.out.println("int C:"+numC);
            System.out.println("int D:"+d);
        }
        public void printData2(){
            System.out.println("c:"+numC);
            System.out.println("d:"+d);
        }
    }
}
