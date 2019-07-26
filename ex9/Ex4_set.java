package Ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ex4_set {
	public static void main(String[] args) {
	HashSet<String> h1 = new HashSet<String>();
	TreeSet<String> h2 = new TreeSet<String>();// 오름차순
	LinkedHashSet<String> h3 = new LinkedHashSet<String>(); //입력순
	
	h1.add("ZTEST");
	h1.add("BTest");
	h1.add("ATEST");
	h1.add("CTEST");
	
	h2.add("ZTEST");
	h2.add("BTest");
	h2.add("ATEST");
	h2.add("CTEST");
	
	h3.add("ZTEST");
	h3.add("BTest");
	h3.add("ATEST");
	h3.add("CTEST");
	
	System.out.println("크기 :" +h1.size());
	
	for(String e : h1) {
		System.out.println(e);
	}
	
	Iterator<String> it= h1.iterator();
	Iterator<String> it1= h2.iterator();
	Iterator<String> it2= h3.iterator();

	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}
	
}
}
