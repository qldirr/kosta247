package kosta.net4;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam3 {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			while (true) {
				Socket socket = serverSocket.accept();
				Thread thread = new PerClinetThread(socket);
				thread.start();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
