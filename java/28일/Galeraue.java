package kosta.mission2;

import java.util.Scanner;

public class Galeraue {
	
	public static int solution(int a, int b, int day) {
		if(b > a) {
			return day;
		}else {
			return solution(a*2, b*3, day+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A = 0;
		int B = 0;
		
		for(int i=0;i<T;i++) {
			System.out.println("#" + (i+1) + " " + solution(sc.nextInt(), sc.nextInt(), 0));
		}
		
//		for(int i=0;i<T;i++) {
//			A = sc.nextInt();
//			B = sc.nextInt();
//			
//			for(int j=1;j<=20;j++) {
//				A = A * 2;
//				B = B * 3;
//				if(A < B) {
//					System.out.println("#" + i + " " + j);
//					break;
//				}
//			}			
//		}
		
	}

}
