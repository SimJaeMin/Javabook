package ex3;
/* MyTeamA */
public class MyTeamB implements MyInter{
//MyInter �� ��ӹ��� ��� �߻� �޼��带 ������ �ؾ��Ѵ�.
    @Override
    public void draw() {
        System.out.println(drawNum()+"���� �׸��� B���� �׸���");
    }
    @Override
    public void paint() {
        System.out.println("B���� ĥ�ϴ�.");
    }
    private int drawNum(){
        return 10;
    }
}
