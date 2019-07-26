package Ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExamLinkedArrayList {
	public void allList(List<String> ar) {
		long start =System.currentTimeMillis();
		
		for(String e : ar) {
			String msg =e;
			if(e.contentEquals("kosta")) {}
		}
		long end=System.currentTimeMillis();
		System.out.println("소요시간 : "+(end-start));
		
	}
	
	
//	public static void main(String[] args) {
//		ExamLinkedArrayList ref=new ExamLinkedArrayList();
//		ArrayList<String> ar= new ArrayList<>();
//		LinkedList<String> ar1= new LinkedList<String>();
//		for(int i =0 ; i<=10000000;i++) {
//			if(i%5==0) {
//				ar.add("Kosta");
//				ar1.add("kosta");
//			}else {
//				ar.add("Test1");
//				ar1.add("Test1");
//			}
//		
//		}
//		ref.allList(ar);
//		ref.allList(ar1);
//		
//	}
}
