package ex01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex1_SocketExam {
//	sever : socket -> [bind() -> listen() ] -> accpet() -> Stream() -> close()
//	bind() : port socket �� ���� ������ �Ҵ�
//	listen() : Ŭ���̾�Ʈ�� ���� ��û�� Ȯ��
//	accept() : Ŭ���̾�Ʈ�� ������ ����
//	
//	Ex1_server
//	1.serverSocket�� �����Ѵ�.
//	2 accpet() ȣ���ؼ� ���ӵ� socket�� ��ȯ�Ѵ�.
//	2-1 ���� �����ڸ� ó���ϱ� ���ؼ� arraylist�� ����Ѵ�.
//	3. socket���� �����ϴ� stream���� ����Ѵ�.
//	3-1 readLine()�� ������� Thread �����Ѵ�.
//	���� Ư���� ��û�� ���� ���� GUI�� ������ ���������� �ʴ´�.

	public static class Ex1_Server{
		//���ۼ��� 1. ServerSocket �����ϰ� �����Ѵ�.
		private ServerSocket ss;
		
		private ArrayList<ServerThread> cList;
		public Ex1_Server() {
			try {
				ss=new ServerSocket(9999);
				System.out.println("Server Strat");
				cList=new ArrayList<>();
			} catch (IOException e) {
				System.out.println("�̹� ������� PORT �Դϴ�.");
				// TODO: handle exception
			}
		}
	
		public static void main(String[] args) {
		
			Ex1_Server server = new Ex1_Server();
			server.execute();
		}
		
		public void sendMessage(String clientMsg) {
			// TODO Auto-generated method stub
			for(ServerThread e : cList) {
				e.getPw().println(clientMsg);
			}
		}
	
		
	
	public void execute() {
		//�����ؼ� Socket�� �޴� ���񽺸� �ؾ��Ѵ�.
		//accept()ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
		while(true) {
			try {
				//socket�� �ϳ��� ���Ӹ��� ����Ѵ�.
				//����ڿ��� ������ ������ Thread�� ���� �����ؼ�
				//start()�ϸ鼭, ������� ���� �ּҰ���
				//arraylist �����ߴ�.
				Socket s =ss.accept();
				ServerThread ct= new ServerThread(s,this);
				cList.add(ct);
				ct.start();
				System.out.println("Current number of clients : "+ cList.size());
				
			} catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
}
