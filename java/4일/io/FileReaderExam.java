package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		//파일에 있는 문자 데이터를 읽기
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				System.out.print(arr);
			}
			
//			while(true) {
//				int data = reader.read();
//				if(data == -1) break;
//				System.out.print((char)data);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e2) {}
		}

	}

}
