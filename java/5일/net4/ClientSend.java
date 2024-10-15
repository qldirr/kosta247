package kosta.net4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientSend extends Thread implements ActionListener {
	Socket socket;
	JTextField inTx;
//	JButton ok;
//	JTextArea outTa;
//	List list;
	String str = "";
	String end = "";
	PrintWriter write;
	
	public ClientSend(Socket socket, JTextField inTx) {
		super();
		this.socket = socket;
		this.inTx = inTx;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		str = inTx.getText();
		try {
			if (str.equals("bye")) {
				end = "bye";
			} 
			write = new PrintWriter(socket.getOutputStream());
			write.println(str);
			write.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		inTx.setText("");
	}
	
	@Override
	public void run() {
		try {
			inTx.addActionListener(this);
			
			while (true) {
				if (end.equals("bye")) {
					System.out.println(end);
					break;
				}	
			} 
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
