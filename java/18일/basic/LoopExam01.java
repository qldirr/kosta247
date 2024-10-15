package kosta.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		//while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		//1~10까지 합을 구하시오.
//		int sum = 0;
//		int i = 1;//초기식
//		while(i<=100) {//조건식
//			sum += i;//명령문
//			i++;
//		}
//		
//		System.out.println("1~10까지의 합: " + sum);
		
		//퀴즈>구구단 7단 출력
		//7 * 1 = 7
		//7 * 2 = 14
		//....
		//7 * 9 = 63
		
//		int i = 1;
//		while(i<=9) {
//			System.out.println("5 * " + i + " = " + (5*i));
//			i++;
//		}
		
		//for문 : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수평구조
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum += i;
//		}
//		
//		System.out.println("1~10까지의 합: " + sum);
		
		//퀴즈>구구단 7단 출력(for)
//		for(int i=1;i<=9;i++) {
//			System.out.println("7 * " + i + " = " + (7*i));
//		}
		
		//퀴즈>1~100 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
//		for(int i=1;i<=100;i++) {
//			if(!(i%2==0 || i%3==0)) {
//				System.out.print(i + ", ");
//			}
//		}
		
//		for(int i=1;i<=100;i++) {
//			if((i%2==0 || i%3==0)) {
//				continue;
//			}
//			System.out.print(i + ", ");
//		}
		
		//do~while : 명령문을 먼 실행 후 조건을 비교
		//적어도 1번은 무조건 실행이 필요하기 때문
		//키보드로 부터 숫자를 입력 받기
		//음수를 입력하면 새롭게 다시 입력 받도록 하자.
		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		
//		do {
//			System.out.print("양의 정수 입력: ");
//			n = sc.nextInt();
//		}while(n <= 0);
//		
//		System.out.println("입력 값: " + n);
		
		//퀴즈>2개의 정수를 입력 받아 b-a 결과 출력하자.
		//b > a 되도록 입력 받자. => a가 b보다 크면 새롭게 입력 받도록 하자.
//		int a = 0;
//		int b = 0;
//		
//		do {
//			System.out.print("a: ");
//			a = sc.nextInt();
//			System.out.print("b: ");
//			b = sc.nextInt();
//		}while(a > b);
//		
//		System.out.println("(b-a) : " + (b-a));
		
		//while 무한반복과 => break문 이용해서 구현해 보세요
		int a = 0;
		int b = 0;
		
		while(true) {
			System.out.print("a: ");
			a = sc.nextInt();
			System.out.print("b: ");
			b = sc.nextInt();
			
			if(a<b) break;
		}
		
		System.out.println("(b-a) : " + (b-a));
		
	}
}













