package ex2;
/* Draw */
// abstract �߻� Ŭ������ ����
public abstract class Draw {
    private String msg;
    // abstract �߻� �޼��� : �̿ϼ��� �޼��� ����
    abstract public void draw();
    public Draw() {
        msg ="�θ��� ��û�� �ڿ�";
    }
    public String getMsg() {
        return msg;
    }
}
