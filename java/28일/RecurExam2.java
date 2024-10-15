package kosta.basic;

import java.util.Scanner;

public class RecurExam2 {
	
	public static int recur(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n + recur(n-1);
		}
	}

	public static void main(String[] args) {
		//0~n까지의  함께를 구하자. => 재귀함수
		//입력 : 10   => 55
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.println("n의 합 : " + recur(n));
		
		
	}

}
