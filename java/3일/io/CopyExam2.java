package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CopyExam2 {

	public static void main(String[] args) {
		//FileInputStream, FileOutputStream 이용하여 복사를 구현하자.
		//String => byte[] :getBytes() :  byte[] => String : new String(byte[])
		//poem3.txt => poem4.txt
		FileInputStream in = null;
		FileOutputStream out = null;
		byte arr[] = new byte[10];
		
		try {
			in = new FileInputStream("poem3.txt");
			out = new FileOutputStream("poem4.txt");
			
			while(true) {
				Arrays.fill(arr, (byte)0);
				int data = in.read(arr);
				if(data == -1) break;
				out.write(arr);
			}
			
			System.out.println("복사완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
			} catch (Exception e2) {}
		}

	}

}









