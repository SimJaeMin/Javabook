package ex1;
/* Ex1_Parent : �߻� �޼��带 ���� Ŭ������ �ݵ�� �߻� Ŭ�����̴�. */
public abstract class Ex1_Parent {
    // ��� ���� �ڿ�
    private final int pay = 1000000;
    //�߻� �޼��� : �̼�! 
    abstract public void moveMountain();
   //public void moveMountain(){}
    public int getPay() {
        return pay;
    }
    
}
