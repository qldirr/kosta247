package kosta.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class CopyExam {

	public static void main(String[] args) {
		//poem2.txt  => poem3.txt : 복사를 구현해 보자.
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[10];
		
		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");
			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				writer.write(arr);
			}
			
			System.out.println("복사완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				reader.close();
			} catch (Exception e2) {}
		}
	}

}










