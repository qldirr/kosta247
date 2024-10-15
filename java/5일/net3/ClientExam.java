package kosta.net3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 9000);
			
			Thread sender = new ClientSender(socket);
			Thread receive = new ClientReceive(socket);
			
			sender.start();
			receive.start();					
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}









