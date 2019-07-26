package java03;
import java.util.*;
import java.io.IOException;
import java.net.*;

//server : socket ->[bind() -> listen()] ->accept() -> Stream() -> close()
//bind() : port socket�� ���� ������ �Ҵ�
//listen() : Ŭ���̾�Ʈ�� ���� ��û�� Ȯ��
//accept() : Ŭ���̾�Ʈ�� ������ ����

//Ex1_Server
//1. ServerSocket�� �����Ѵ�
//2. accept() ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�
//2-1. ���� �����ڸ� ó���ϱ� ���ؼ� ArrayList�� ����Ѵ�.
//3.Socket���� �����ϴ� Stream���� ����Ѵ�.
//3-1. read.line()�� ������� Thread �����Ѵ�.
//���� , Ư���� ��û�� ���� ���� GUI�� ������ ���������� �ʴ´�.
public class Ex1_Server {
	//���ۼ��� 1.
	private ServerSocket ss;
	//2-1�� ���� ����
	private ArrayList<ServerThread> cList;
	
	public Ex1_Server() {
		try {
			//������ ������ �� �ֵ��� port�� ����
			ss = new ServerSocket(9999);
			System.out.println("Sever Start");
			cList = new ArrayList<>();
		}catch(IOException ex){
			System.out.println("�̹� ������� port �Դϴ�.");
		}
	}
	
	public void excute() {
		//�����ؼ� socket�� �޴� ���񽺸� �ؾ��Ѵ�
		//2.accept() ȣ���ؼ� ���ӵ� ��Ĺ�� ��ȯ�Ѵ�.
                
		while(true) {
			//***********Socket�� �ϳ��� ���Ӹ��� ����Ѵ�.
			//����ڿ��� ������ ������ Thread�� ���� �����ؼ�
			//start()�ϸ鼭 ������� ��Ĺ�� �ּҰ��� ArrayList�����ߴ�+------
		try {
			Socket s = ss.accept();
                        System.out.println("�������� READ\n");

			ServerThread ct = new ServerThread(s,this);
			cList.add(ct);
			ct.start();
			System.out.println("Current number of Clients" + cList.size());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	}
	public void sendMessage(String clientMsg) {
		// TODO Auto-generated method stub
		for(ServerThread e: cList) {
                    
                        System.out.println("���� ����޼���");
			e.getPw().println(clientMsg);
		}
	}
	public static void main(String[] args) {
		Ex1_Server server = new Ex1_Server();
		server.excute();
	}
	
	
}
