package ex4;
/* Ex2_LocalInner 
 ���� ����Ŭ���� : �޼���, ������ �����ȿ��� ����
 ���ÿ��� ����ǰ� ������ ������ ���������� �����Ѵ�.
*/
public class Ex2_LocalInner {
    private int a;
    public Ex2_LocalInner() { a=100; }
    // ���� ����Ŭ�����ȿ���..... �������� �̾߱� 
    //jdk 7���ϱ����� final�̶�� ���
    // 8���� ���� ���ʹ� final�� ��� ���������� ��� ���
    public void insertTest(final int num){
      int b = 200; // ���
      int c = num; // ��� 
        class Inner{ // �޼ҵ� ���� �ȿ� ����
            public void getData(){
                System.out.println("����ʵ� ���� :"+a);
                // �޼������ ����� ������ �� ������
                // ���������� ���� �� ����.
               // System.out.println("�������� ����"+(b++));
               //System.out.println("��������?"+(c+=num));
               //System.out.println(b);
            }
        }
        new Inner().getData();
        // �͸� ���� Ŭ�������� �����ؼ� ������� ���� ���
        b = 30;
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        new Ex2_LocalInner().insertTest(200);
    }
}
