package ex2;


import java.io.FileNotFoundException;
import java.io.IOException;


/* Main */
public class Main {
    public static void main(String[] args) {
      // ������ : �ϳ��� ��ü�� ���� ��ü�� ����, ����,
      // ���� �����ϴ� ����!
      Draw[] d = new Draw[3];
      d[0] = new Circle();
      d[1] = new Rect();
      d[2] = new Triangle();
      //��ȭ�� ������ �ڵ� : � ��ü�� �߰� �Ǵ���
      //�Ʒ��ڵ忡���� ��ȭ�� ����.
      for(Draw e : d){
          e.draw();
      }
    }
}
