package ex01;

import java.util.StringTokenizer;

public class practice {
	int x;
	int y;
	public practice(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		String[] txt = new String[4];

		txt[0]="ȫ�浿,20,�����,����";

		txt[1]="�ƹ���,25,�λ��,����";

		txt[2]="ȣȣȣ,23,,����";

		txt[3]="������,,��õ��,����";
		
		for(String line : txt) {

			//�и�

			String[] temp = line.split(",");

					

			for(String item : temp) {

				System.out.print(item+"\t");

			}

		  System.out.println();

		}	



		System.out.println("===========================");
		
		for(String line : txt) {

			StringTokenizer st = new StringTokenizer(line, ",");

			while(st.hasMoreTokens()) {

				System.out.print(st.nextToken()+"\t");

			}

			System.out.println();

		}


	}
}
