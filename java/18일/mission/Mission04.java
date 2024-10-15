package kosta.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		//Scanner 객체 사용시 주의 사항
		//정수형 입력 받고 문자열을 입력 받을 때 => nextLine() 한번 더 호출한다.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("a: ");
//		int a = Integer.parseInt(sc.nextLine());
//	    int a = sc.nextInt();
//		
//		sc.nextLine();
//		System.out.print("b: ");
//		String b = sc.nextLine();
//		
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//		
//		System.out.println("done..");
		
		//문자열 비교
		
//		int a = 10;
//		int b = 10;
//		
//		String c = "abc";
//		String d = "abc";
//		
//		if(c.equals(d)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
//		if(c == d) {//문자열에 대한 주소값을 비교
//			System.out.println("같다.");
//		}
		
		//두 정수와 문자열을 입력 받아
		//사칙 연산 결과를 출력해 보자.(계산기 프로그램 구현)
		//ex>정수1 : 10
		//       정수2 : 20
		//       연산자 : +
		//       결과 : 30
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();//추가
		System.out.print("연산자: ");
		String oper = sc.nextLine();
		double result = 0; 
		
		if(oper.equals("+")) {
			result = num1 + num2;
		}else if(oper.equals("-")) {
			result = num1 - num2;
		}else if(oper.equals("*")) {
			result = num1 * num2;
		}else {
			result = num1 / num2;
		}
		
		System.out.println("결과값 : " +result);

	}

}











