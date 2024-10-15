package kosta.net4;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class ClientReceiver extends Thread {
	Socket socket;
	JTextArea outTa;
	String result = "";
	List list;
	String enter;
	String exit;
	
	public ClientReceiver(Socket socket, JTextArea outTa, List list) {
		super();
		this.socket = socket;
		this.outTa = outTa;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				
//				if (str.substring(str.indexOf("<")).equals("<")) {
//					
////					exit = str.substring(str.indexOf("["), str.indexOf("]"));
//					list.add(enter);
//				}
				if(str.contains("<")){
					enter = str.substring(str.indexOf("<") + 1, str.indexOf(">"));
					list.add(enter);
				}
				
				if(str.contains("[")){
					exit = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
					list.remove(exit);
				}
				result += str + "\n";
				outTa.setText(result);
				outTa.setCaretPosition(outTa.getDocument().getLength());
//				System.out.println("클라이언트 수신:" + str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
