package Ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex5_MyLotto implements Ex5_LottoInter{
	private ArrayList<TreeSet<Integer>> tlist;

	
	public Ex5_MyLotto() {
	tlist= new ArrayList<TreeSet<Integer>>();
	}
	
	public String getLottoNum() {
		
		StringBuffer sb= new StringBuffer();
		int i=0;
		for(TreeSet<Integer> e:tlist) {
			sb.append("No[").append(i).append("]");
			for(Integer f : e) {
				sb.append(f).append("  ");
			}
				sb.append("\n");
				i++;
		}
		// TODO Auto-generated method stub
		return sb.toString();
	}

	private TreeSet<Integer> execute(){
		TreeSet<Integer> ts= new TreeSet<>();
		while(ts.size()!=6) {
			int rnum=(int)(Math.random()*45+1); ts.add(rnum);
		}return ts;
	}
	
	@Override
	public void setLottoGameNum(int num) {
		num=num/1000;
		for(int i=0;i<num;i++) {
			tlist.add(execute());
		}
	}
	
	public static void main(String[] args) {
		System.out.print("금액을 입력해 주세요 :");
		Scanner sc= new Scanner(System.in);
		int price = Integer.parseInt(sc.nextLine());
		
		Ex5_MyLotto my=new Ex5_MyLotto();
		
		my.setLottoGameNum(price/10);
		
		
	}

}
