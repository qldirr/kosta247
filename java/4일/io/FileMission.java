package kosta.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		//1. 바이트스트림을 이용하여 이미지 파일을 복사해 보자.
//		String source = "D:\\247\\Java\\Facebook.JPG";
//		String dest = "D:\\upload\\Facebook.JPG";
//		
//		FileUtil.copyFile(new File(source), new File(dest));
		
		//2. 디렉토리 전체 복사를 구현하자.
		String source = "D:\\247\\Java\\과제";//파일 10개
		String dest = "D:\\247\\JavaScript\\과제";//파일 10개 복사
				
		try {
			FileUtil.copyDirectory(new File(source), new File(dest));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}

}
