package Ex01;

import java.util.List;
import java.util.ArrayList;

public class Ex2_List {
	private List list;
	public Ex2_List() {
		list = new ArrayList();
		list.add("StringAAA");
		list.add(new Integer(30));
		list.add(new Character('A'));
		list.add(new Float(3.14f));
		list.add("String");
		System.out.println(list.size());
	}
	
	for(Object e : list) {//유전자검사하는거임 instanceof 를 사용하연
		if(e instanceof String) {
			System.out.println("String"+e);
		}else if(e instanceof Integer){
			System.out.println("Integer"+e);
		}
	
		//이렇게도 사용할 수 있음
		String obj=e.getClass().getCanonicalName();
		System.out.print(obj.substring(obj.lastIndexOf(".")+1)+":");
		System.out.println(e);
}



