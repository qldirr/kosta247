package kosta.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		//1. 배열선언, 생성 분리
		int arr[];//배열 선언 => 배열의 주소값을 저장 할 수 있는 변수가 생성
		arr = new int[5];
				
		//2. 배열선언, 생성 함께
		int arr2[] = new int[5];
		
		arr2[0] = 10;
		arr2[1] = 20;
		
		//3. 배열선언, 생성, 초기화 함께
		int arr3[] = {1,2,3,4,5};
		
		//배열에 있는 내용 전체출력 for문 (0~4)
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println("arr3["+i+"]=" + arr3[i]);
//		}
		
		//향상된 for문
//		for(int n : arr3) {
//			System.out.print(n + ",");
//		}
		
		//배열 사용 방법
		//1. 배열에 사용될 데이터타입을 결정한다.
		//2. 배열의 크기를 결정 => ArrayIndexOutOfBoundsException 예외 발생
		//3. 배열생성 방법 선택(1, 2, 3)
		//4. 배열을 어떻게 초기화(직접인덱스 접근, for문, 생성과 동시)
		//5. 배열에 있는 데이터 출력(for문, 향상된 for문, 인덱스접근)
		
		
		//퀴즈>키보드로 부터 문자열을 입력받아 배열에 추가한 후 전체를 출력하자.
		// "q"를 입력할때 까지 입력 받는다.
		//>입력 : 홍길동
		//>입력 : 박길동
		//>입력 : q
		//>출력 : 홍길동, 박길동
		
		Scanner sc = new Scanner(System.in);
		String sArr[] = new String[10];
		int count = 0;
		
		while(true) {
			System.out.print("입력: ");
			String str = sc.nextLine();
			if(str.equals("q")) break;
			sArr[count++] = str;
		}
		
		for(int i=0;i<count;i++) {
			System.out.print(sArr[i] + ",");
		}
		
	}

}








