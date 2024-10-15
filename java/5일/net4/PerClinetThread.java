package kosta.net4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerClinetThread extends Thread {
	static List<PrintWriter> list = Collections
			.synchronizedList(new ArrayList<PrintWriter>());
	PrintWriter writer;
	Socket socket;

	public PerClinetThread(Socket socket) {
		super();
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void sendAll(String msg){
		for (PrintWriter writer : list) {
			writer.println(msg);
			writer.flush();
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = br.readLine();
			sendAll("##<"+name + ">입장하셨습니다.##");
			while (true) {
				String str = br.readLine();
				if(str == null){
					break;
				}
				sendAll(name + ">>" + str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			sendAll("##["+name + "]님 퇴장하셨습니다.##");
			list.remove(writer);
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}

}
