package kosta.io;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String args[]) {
		//키보드로 부터 문자열을 입력 받아 파일쓰기를 구현하자.
		//"q"를 입력하면 종료 : q를 입력하지 전까지의 문자열을 파일쓰기를 하자.
		//FileWriter : write(문자열);
		//파일명 : poem2.txt" : 실제 존재X
		//리플레쉬 = 파일 확인
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		
		System.out.print("문자열 입력: ");
		String str = "";
		String poem = "";
		
		while(!(str=sc.nextLine()).equals("q")){
			poem += str;
			poem += "\n";
		}
		
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e2) {}
		}
	}
}













