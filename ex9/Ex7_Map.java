package Ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Ex7_Map {
	public static void main(String[] args) {
		String[] msg = {"AA","BB","CC","DD","EE","FF"};
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		int cnt=0;
		for(String s: msg) {
			map.put(cnt, s);
			cnt++;
		}
		System.out.println("Map size :"+map.size());
	
		Set<Integer> s = map.keySet();
		for(Integer a:s) {
			System.out.println(map.get(a));
		}
	
		//����� 
		//Map.Entry<�ڷ���, �ڷ���> : key�� value�� �޾ƿ��� ���� �������̽�
		//entrySet(): key, value�� ������ �� Map.Entry(�ڷ���, �ڷ���) �����ؼ� ��ȯ�ϴ�.
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	
}
}

