package Ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_ArrayList {
	private ArrayList<String> list;
	private ArrayList<Integer> nList;
	
	public Ex3_ArrayList() {
		list=new ArrayList<>();
		list.add("test1");
		list.add("10");
		list.add("3.14");
		nList=new ArrayList<>();
		nList.add(1000);
		nList.add(2000);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Integer> it1 = nList.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex3_ArrayList a = new Ex3_ArrayList();
		
	}
}
