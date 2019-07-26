package ex01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex1_SocketExam {
//	sever : socket -> [bind() -> listen() ] -> accpet() -> Stream() -> close()
//	bind() : port socket 에 대한 정보를 할당
//	listen() : 클라이언트의 접속 요청을 확인
//	accept() : 클라이언트의 소켓을 생성
//	
//	Ex1_server
//	1.serverSocket을 생성한다.
//	2 accpet() 호출해서 접속된 socket을 반환한다.
//	2-1 다중 접속자를 처리하기 위해서 arraylist를 사용한다.
//	3. socket에서 제공하는 stream으로 통신한다.
//	3-1 readLine()을 담당해줄 Thread 제작한다.
//	참고 특별한 요청이 없을 때는 GUI로 서버를 제작하지는 않는다.

	public static class Ex1_Server{
		//제작순서 1. ServerSocket 선언하고 생성한다.
		private ServerSocket ss;
		
		private ArrayList<ServerThread> cList;
		public Ex1_Server() {
			try {
				ss=new ServerSocket(9999);
				System.out.println("Server Strat");
				cList=new ArrayList<>();
			} catch (IOException e) {
				System.out.println("이미 사용중인 PORT 입니다.");
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
		//지속해서 Socket을 받는 서비스를 해야한다.
		//accept()호출해서 접속된 Socket을 반환한다.
		while(true) {
			try {
				//socket은 하나의 접속만을 담당한다.
				//사용자에게 응답을 위임한 Thread를 각각 생성해서
				//start()하면서, 사용자의 소켓 주소값을
				//arraylist 저장했다.
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
