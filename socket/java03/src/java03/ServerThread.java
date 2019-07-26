package java03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class ServerThread extends Thread{
	private Socket socket;
	private Ex1_Server server;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ServerThread(Socket socket, Ex1_Server server) {
		this.socket = socket;
		this.server = server;
		System.out.println("������ IP : "+socket.getInetAddress().getHostAddress());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			pw = new PrintWriter(socket.getOutputStream(), true);
			//read line() ���
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//����� �������� ���� �޼����� ��� �޾ƾ��Ѵ�
			
			while(true) {
				String clientMsg = br.readLine();

				System.out.println("Log : "+clientMsg);
				server.sendMessage(clientMsg);
				}
		}catch(IOException ex) {	
		}
	}
	public PrintWriter getPw() {
        return pw;
    }

}
