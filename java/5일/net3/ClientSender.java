package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;

public class ClientSender extends Thread {
	Socket socket;

	public ClientSender(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true){
				String str = br.readLine();
				if(str.equals("bye")){
					String str2 = URLEncoder.encode("끝", "utf-8");
					writer.println(str2);
					writer.flush();
					break;
				}
				String str2 = URLEncoder.encode(str, "utf-8");
				writer.println(str2);
				writer.flush();
			}			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
