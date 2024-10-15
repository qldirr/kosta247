package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {
	private Member m;
	
	//객체 직렬화
	public void write() {
		m = new Member("홍길동", 20);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {}
		}		
	}
	
	//객체 역직렬화
	public void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}

	public static void main(String[] args) {
		//파일에 Member객체를 저장해 보자(object.dat)
		SerialMain sm = new SerialMain();
		
		sm.write();//직렬화
		sm.m = null;
		sm.read();
		
		System.out.println(sm.m);
	}

}



