package ex3;
/* MyTeamA */
public class MyTeamA implements MyInter{
//MyInter �� ��ӹ��� ��� �߻� �޼��带 ������ �ؾ��Ѵ�.
    @Override
    public void draw() {
        System.out.println("A���� �׸���");
    }
    @Override
    public void paint() {
        System.out.println("A���� ĥ�ϴ�."+execute());
    }
    private String execute(){
        return "A���� �����ͺ��̽����� ������ ���� Red";
    }
}
