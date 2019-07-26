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
	
	for(Object e : list) {//�����ڰ˻��ϴ°��� instanceof �� ����Ͽ�
		if(e instanceof String) {
			System.out.println("String"+e);
		}else if(e instanceof Integer){
			System.out.println("Integer"+e);
		}
	
		//�̷��Ե� ����� �� ����
		String obj=e.getClass().getCanonicalName();
		System.out.print(obj.substring(obj.lastIndexOf(".")+1)+":");
		System.out.println(e);
}



