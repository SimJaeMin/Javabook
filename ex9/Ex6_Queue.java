package Ex01;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6_Queue {
	public static void main(String[] args) {

	Queue<String> qu = new LinkedList<String>();
	qu.offer("A");
	qu.offer("B");
	qu.offer("C");
	qu.offer("D");
	System.out.println(qu.poll());
	System.out.println(qu.poll());
	System.out.println(qu.poll());
	System.out.println(qu.peek());
	
	Queue<String> q1 = new LinkedList<String>();
	q1.offer("�̼���");
	q1.offer("����ȫ");
	q1.offer("���ӽ�Ŵ");
	
	while(q1.isEmpty()==false) {
		System.out.println(q1.poll());
	}
	
	}}

