package ex4;
/* Ex3_StaticInnerMain */
public class Ex3_StaticInnerMain {
    public static void main(String[] args) {
        // static �� �������� ����� �����ϴ�.
        // ������ü�� �����ؼ� ����(����) �ϴ��� static������ �����ϳ���.
        // static�� �����ѿܺ�Ŭ����.static�ڿ� 
        Ex3_StaticInner.Inner.printData();
        System.out.println("------------------------");
        // printData2() ȣ�� �غ��� 
        new Ex3_StaticInner.Inner().printData2();
        Ex3_StaticInner.Inner ref = new Ex3_StaticInner.Inner();
        ref.printData2();
    }
}
