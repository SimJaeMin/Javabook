package ex4;
/* Ex1_MemberMain */
public class Ex1_MemberMain {
    public static void main(String[] args) {
        //�ٽ�����Ʈ 
        //���� Ŭ������ �����Ϸ��� �� ���� 
        //�ܺ� Ŭ������ ������ �� �� �ּҸ� �����ؼ�
        //�ٽ� ���� Ŭ������ �����ϴ� ����̴�.
        // 1. �ܺ�Ŭ���� ����
        Ex1_MemberInner outer = new Ex1_MemberInner();
        // 2. �ܺ�Ŭ������ �ּҰ��� ������ ���� ���� outer�� ���ؼ�
        // ���� Ŭ������ ����
        outer.superA();
        // ����Ŭ������ ���� �ڷ���
        Ex1_MemberInner.Inner inner;
        inner = outer.new Inner();
        inner.printData();
        inner.superB();
        System.out.println("=======================");
        //��������) 
        // �ܺ�Ŭ���� ���� �� ���� Ŭ���� �����ϰ��� �Ҷ�
        // ���ٷ� �����ϰ� �ٷ� printData()
        // �͸����� ��ü�� �����ϴ� ������� printData()�� ȣ���ϱ� 
        new Ex1_MemberInner().new Inner().printData();
        new Ex1_MemberInner().new Inner().superB();
    }
}
