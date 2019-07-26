package java03;
import java.util.*;
import java.io.IOException;
import java.net.*;

//server : socket ->[bind() -> listen()] ->accept() -> Stream() -> close()
//bind() : port socket에 대한 정보를 할당
//listen() : 클라이언트의 접속 요청을 확인
//accept() : 클라이언트의 소켓을 생성

//Ex1_Server
//1. ServerSocket을 생성한다
//2. accept() 호출해서 접속된 Socket을 반환한다
//2-1. 다중 접속자를 처리하기 위해서 ArrayList를 사용한다.
//3.Socket에서 제공하는 Stream으로 통신한다.
//3-1. read.line()을 담당하줄 Thread 제작한다.
//참고 , 특별한 요청이 없을 때는 GUI로 서버를 제작하지는 않는다.
public class Ex1_Server {
	//제작순서 1.
	private ServerSocket ss;
	//2-1을 위한 선언
	private ArrayList<ServerThread> cList;
	
	public Ex1_Server() {
		try {
			//서버가 접속할 수 있도록 port를 오픈
			ss = new ServerSocket(9999);
			System.out.println("Sever Start");
			cList = new ArrayList<>();
		}catch(IOException ex){
			System.out.println("이미 사용중인 port 입니다.");
		}
	}
	
	public void excute() {
		//지속해서 socket을 받는 서비스를 해야한다
		//2.accept() 호출해서 접속된 소캣을 반환한다.
                
		while(true) {
			//***********Socket은 하나의 접속만을 담당한다.
			//사용자에게 응답을 위임한 Thread를 각각 생성해서
			//start()하면서 사용자의 소캣의 주소값을 ArrayList저장했다+------
		try {
			Socket s = ss.accept();
                        System.out.println("서버접속 READ\n");

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
                    
                        System.out.println("서버 센드메세지");
			e.getPw().println(clientMsg);
		}
	}
	public static void main(String[] args) {
		Ex1_Server server = new Ex1_Server();
		server.excute();
	}
	
	
}
