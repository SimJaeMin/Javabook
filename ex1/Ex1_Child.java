package ex1;
/* Ex1_Child */
public class Ex1_Child extends Ex1_Parent{
  //2. ��ӹ��� �� �ִ�.
    @Override
    public String toString() {
        return String.valueOf("��ӹ��� �ݾ�:"+getPay());
    }
   
    //1. �����Ǹ� �ؾ߸�
    @Override
    public void moveMountain() {
        System.out.println("���� ���������� �ű� �� "+toString()+" �޾Ҵ�.");
    }

}
