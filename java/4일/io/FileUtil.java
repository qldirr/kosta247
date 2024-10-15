package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileUtil {
	//디렉토리 복사(새로운 디렉토리를 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest)throws Exception {
		if(source.isDirectory()) {
			dest.mkdirs();
			
			File fileList[] = source.listFiles();
			for(int i=0;i<fileList.length;i++) {
				File sourceFile = fileList[i];
				if(sourceFile.isDirectory()) {
					File s_destFile = new File(dest, sourceFile.getName());
					copyDirectory(sourceFile, s_destFile);
				}else {
					File destFile = new File(dest, sourceFile.getName());
					copyFile(sourceFile, destFile);
				}
			}			
		}
	}
	
	//바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File dest) {
		FileInputStream in = null;
		FileOutputStream out = null;
		byte arr[] = new byte[500];
		int data = 0;
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			
			while((data=in.read(arr)) != -1) {
				out.write(arr);
				Arrays.fill(arr, (byte)0);
			}		
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out != null) {
					out.close();
				}
				if(in != null ) {
					in.close();
				}
			} catch (Exception e2) {}
		}
		
	}

}







