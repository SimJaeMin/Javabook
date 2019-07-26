package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import ex01.Ex1_SocketExam.Ex1_Server;

public class ServerThread extends Thread {
	private Socket socket;
	private Ex1_Server server;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ServerThread(Socket socket ,Ex1_Server server) {
		
	}
	
	public void run() {
		try {
			pw=new PrintWriter(socket.getOutputStream(),true);
			//readLine() 을 담당
			
			br = new BufferedReader((new InputStreamReader(socket.getInputStream()));
			//사용자 소켓으로부터 메세지를 계속 받아야 한다.
			while(true) {
				String clientMsg =br.readLine();
				System.out.println("Log: "+ clinetMsg);
				server.sendMessage(clientMsg);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	public PrintWriter getPw() {
		return pw;
	}

	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
	
}
