package conn;

import java.util.ArrayList;
import java.util.Scanner;
import oracle02.SawonVO;

public class UserTest {

    Scanner sc = new Scanner(System.in);

    public UserTest() throws Exception {

        while (true) {

            System.out.print("�޴�: �Է�=>1 �˻� => 2 ���� => 3");

            String menu = sc.nextLine();

            if (menu.equals("1")) {

                sawon_ins();

            } else if (menu.equals("2")) {

                listSearch();

            } else {

                System.exit(0);

            }

        }

    }

    public void listSearch() throws Exception {

        System.out.print("�˻��� �μ� ��ȣ�� �Է�:");

        String deptno = sc.nextLine();

        ArrayList<SawonVO> relist = Dao.getDao().sawonSearch(Integer.parseInt(deptno));

        StringBuffer sb = new StringBuffer();

        for (SawonVO e : relist) {

            sb.append(" ��ȣ :");

            sb.append(e.getSabun()).append("\n");

            sb.append(" �̸� :");

            sb.append(e.getSaname()).append("\n");

            sb.append(" ���� :");

            sb.append(e.getSajob()).append("\n");

            sb.append(" �μ���ȣ : ");

            sb.append(e.getDeptno()).append("\n");

            sb.append(" ��¥ ");

            sb.append(e.getSahire()).append("\n");

            sb.append("\n");

        }

        System.out.println(sb.toString());

    }

    public static void main(String[] args) throws Exception {

        UserTest u = new UserTest();

    }

    private void sawon_ins() {

        SawonVO v = new SawonVO();

        System.out.print("����̸� : ");

        v.setSaname(sc.nextLine());

        System.out.print("�μ���ȣ : ");

        v.setDeptno(Integer.parseInt(sc.nextLine()));

        System.out.print("���� : ");

        v.setSajob(sc.nextLine());

        System.out.print("�޿� : ");

        v.setSapay(Integer.parseInt(sc.nextLine()));

        System.out.println("���� : ");

        v.setSasex(sc.nextLine());
        
        System.out.println("�Ŵ���: ");

        v.setSamgr(Integer.parseInt(sc.nextLine()));
        
        Dao.getDao().insertDB(v);

    }

}
