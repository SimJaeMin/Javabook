package ex4;



/* Ex4_Anon */
// �͸��� ���� �ּҰ� ���� ��ü�� �����ϴ� ���� �ǹ��ϴµ�
// �������̽�, �߻�Ŭ������ new �����ڷ� ������ �� ����
// �͸� ���� Ŭ������ ������ �� �ڿ��� ȣ���ϴ� �����̴�.
// �׿ܿ� �Ϲ� Ŭ������ �͸� ���� Ŭ������ ���� ����� �� �ִ�.
public class Ex4_Anon {
    // class A => X
    MyTest test =  new MyTest() {
            @Override
            public void printData() {
                System.out.println("data:"+data);
            }  
    };
    public void mytest(){
        new MyTest() {
            @Override
            public void printData() {
                System.out.println("data:"+data);
            }
        }.printData();
    }
    public static void main(String[] args) {
        new Ex4_Anon().mytest();
    }
}
