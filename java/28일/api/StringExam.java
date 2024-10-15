package kosta.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		//1. String 클래스 생성 방법의 차이점
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
//		if(str == str3) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		//2. String클래의 특징(불변성)  => StringBuffer, StringBuilder(가변성)
		String str4 = str.concat("DEF");
		System.out.println(str);
		System.out.println(str4);
		//연산자(+) => 변경할 수 있다.
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num=10";
		}
		//System.out.println(sql);
		
		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);
		
		//해당 문자열의 위치를 파악 => indexOf("문자열") => 해당 문자열의 인덱스, 없으면 -1
		System.out.println(sql.indexOf("$"));
		
		//문자열 길이
		System.out.println(sql.length());
		
		//인덱스에 해당하는 문자 출력 => charAt(인덱스) : char
		//charAt(), length() 이용해서 sql => 전체 출력
//		for(int i=0;i<sql.length();i++) {
//			System.out.print(sql.charAt(i));
//		}
		
		//문자열 부분 추출 : subString(5), subString(5, 10)
		//퀴즈> sql 변수에서 "board" 문자열만 추출해 보자.
		//System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1);
		
		System.out.println(head + " : " + pattern);
		
		if(fileName.endsWith("jpg")){//startsWith("문자열")
			System.out.println("이미지 파일");
		}

		String id = "Kosta ";
		String m_id = "kosta";
		//id = id.toLowerCase();
		
		if(m_id.equalsIgnoreCase(id.trim())) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//문자열 => String[] 변환
		String fruits = "사과/포도/수박/배";
		String arr[] = fruits.split("/");
		System.out.println(Arrays.toString(arr));
		
		int n = 10;
		//String s = n + "";
		String s = String.valueOf(n);
		
		
	}

}


















