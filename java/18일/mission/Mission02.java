package kosta.mission;

import java.util.Scanner;

public class Mission02 {
	
	//총점을 구하기 위한 메서드
	//파라미터 : 국어, 영어, 수학
	//리턴 유무 : int
	public static int sumAll(int kor, int eng, int mat) {
		int sum = kor + eng + mat;
		
		return sum;
	}
	
	public static int average(int sum) {
		int aver = sum/3;
		
		return aver;
	}
	

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
		
		//int sum = kor + eng + mat;
		//int aver = (int)(sum/3.0); 		
		
		int sum = sumAll(kor, eng, mat);
		int aver = average(sum);
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + aver);
		
		//학점 90이상 => A학점
		//      80이상 => B학점
		//      70이상 => C학점
		//      60이상 => D학점
		//      60미만 => F학점
		
		if(aver >= 90) {
			System.out.println("A학점");
		}else if(aver >= 80) {
			System.out.println("B학점");
		}else if(aver >= 70) {
			System.out.println("C학점");
		}else if(aver >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}

	}

}











