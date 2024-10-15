package kosta.io;

import java.io.File;

public class FileExam {
	
	public static void fileList(File file) {
		File list[] = file.listFiles();
		
		for(int i=0;i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("**" + list[i].getName() + "**");
				fileList(list[i]);//재귀함수 호출
			}else {
				System.out.println(" - " + list[i].getName());
			}
		}		
	}
	
	public static void show(File file) {
		if(file.isDirectory()) {
			System.out.println("Dir: " + file.getName());			
			File files[] = file.listFiles();
			for(int i=0;i<files.length;i++) {
				System.out.println("file: " + files[i].getName());
			}
		}else {
			System.out.println("file: " + file.getName());
		}
	}

	public static void main(String[] args) {
		//String path = "D:\\247\\workspace\\java_work\\Java247\\src\\kosta\\io";
		String path = "D:\\247\\workspace\\java_work\\Java247";
		
		//System.out.println(System.getProperty("user.dir"));
		
		File f= new File(path);
		
		fileList(f);
		
		//show(new File(".\\src\\kosta"));//현재 작업디렉토리 => 상대 경로
		//show(new File("./src/kosta"));//현재 작업디렉토리 => 상대 경로
		//show(new File("D:\\247\\workspace\\java_work\\Java247"));//현재 작업디렉토리
		//show(f);
		//show(new File("D:\\247\\workspace\\java_work\\Java247\\src\\kosta\\io\\Video.java"));
		//show(new File("D:\\247\\workspace\\java_work\\Java247\\src\\kosta\\io", "Video.java"));

	}

}
