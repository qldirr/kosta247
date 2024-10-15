package kosta.basic;

import java.util.Scanner;

public class RecurExam {
	
	static int f(int n) {
		if(n > 1) {
			return n * f(n-1);//n * f(n-1) * f(n-2) * f(n-3) * f(n-4)
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		//재귀함수(팩토리얼 계산)
		//5! = 5*4*3*2*1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int x = sc.nextInt();
		
		System.out.println(x + "! : " + f(x));
		
		
	}

}












