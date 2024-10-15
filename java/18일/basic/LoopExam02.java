package kosta.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩 for문
		//전체 구구단
//		for(int i=1;i<=9;i++) {
//			System.out.println("2 * " + i + " = " + (2*i));
//		}
//		
//		for(int i=1;i<=9;i++) {
//			System.out.println("3 * " + i + " = " + (3*i));
//		}
//		
//		for(int i=1;i<=9;i++) {
//			System.out.println("4 * " + i + " = " + (4*i));
//		}
//		
//		for(int i=1;i<=9;i++) {
//			System.out.println("5 * " + i + " = " + (5*i));
//		}
		
		//중첩for문을 이용해서 전체 구구단 출력
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.println("i: " + i + ", j: "+ j) ;
//			}
//		}
		
		
		//퀴즈> 4x + 5y = 60 =>x, y를 구하자(모든 경우수)
		outerLabel:
		for(int i=0;i<=15;i++) {
			for(int j=0;j<=12;j++) {
				if((4*i)+(5*j) == 60) {
					System.out.println("x: " + i + ", y: " + j);
					break outerLabel;
				}
			}
		}
		
		//퀴즈>
		//*
		//**
		//***
		//****
		//*****
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
		//퀴즈>
		//*****
		//****
		//***
		//**
		//*
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}












