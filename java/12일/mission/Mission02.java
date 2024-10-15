package kosta.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 초기화 후
		//총점과 평균을 출력하시오.(평균은 소수점까지 출력 바람)
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		
		System.out.print("국어 입력: ");
		kor = sc.nextInt();
		
		System.out.print("영어 입력: ");
		eng = sc.nextInt();
		
		System.out.print("수학 입력: ");
		mat = sc.nextInt();		
		
		int sum = kor + eng + mat;
		int aver = (int)(sum/3.0); 
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + aver);
				

	}

}
