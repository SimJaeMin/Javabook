package ex2;
/* Ex2_Main */
//1 ����� �޾Ƽ� ������ �ϴ� ���
public class Ex2_Main extends Ex2_WindowDemo{
    public static void main(String[] args) {
        Ex2_Main ref = new Ex2_Main();
        ref.exec1();
//2. �߻�޼��带 ���� �͸� ���� Ŭ������ �����Ǹ� �� ���
      new Ex2_WindowDemo() {
            @Override
            public void exec1() {
                System.out.println("�ٸ� ���");
            }
        }.exec1();
    }

}
