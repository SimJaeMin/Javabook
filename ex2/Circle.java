package ex2;
/* Circle */
public class Circle extends Draw{
    // �ڽ��� �ڿ��� �ʱ�ȭ 
    private String resource;

    public Circle() {
        resource ="�ڽ��� �ڿ�";
    }
    
    // resource ���� 
    @Override
    public void draw() {
        System.out.println("A���� ���� �׸���."+resource);
    }

}
