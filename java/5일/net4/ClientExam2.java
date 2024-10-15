package kosta.net4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.List;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientExam2 {
	
	public static void main(String[] args) {
		JTextField inTx;
		JButton ok;
		JTextArea outTa;
		List list;
		String str;
		
		Socket socket = null;
		ClientReceiver clientReceiver = null;
		ClientSend clientSend = null;
		
		JFrame frame = new JFrame("채팅예제");
//		frame.setSize(600, 1000);
		frame.setLocation(200, 200);
		
		Container containerPanal = frame.getContentPane();
		
		JPanel p1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel(new BorderLayout());
		
		outTa = new JTextArea(15,20);
		JScrollPane scrollPane = new JScrollPane(outTa);
		
		inTx = new JTextField(20);
		
//		inTx.addActionListener(this);
		
		p1.add(scrollPane, BorderLayout.CENTER);
		p1.add(inTx, BorderLayout.SOUTH);
		
		ok = new JButton("접속");
		list = new List();
		
		p2.add(list, BorderLayout.CENTER);
		p2.add(ok, BorderLayout.SOUTH);
		
		containerPanal.add(p1, BorderLayout.CENTER);
		containerPanal.add(p2, BorderLayout.EAST);
		
		try {
//			socket = new Socket("192.168.0.26", 9000);
//			socket = new Socket("192.168.0.16", 9000);
			socket = new Socket("127.0.0.1", 9000);
			
			clientReceiver = new ClientReceiver(socket, outTa, list);
			clientSend = new ClientSend(socket, inTx);
			
			clientReceiver.start();
			clientSend.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
