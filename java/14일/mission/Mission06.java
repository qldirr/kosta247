package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		//UpDown 게임 구현하자.
		//난수를 생성 : 1~100 => 1개 난수 생성
		//키보드로 부터 정수를 입력(1~100)
		//입력한 숫자와 임의의 난수와 비교
		//정답 : "축하합니다. 3번만에 성공" 프로그램 종료
		//오답 : Up/ Down 출력
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int re = r.nextInt(100) + 1;
		System.out.println(re);
		int n = 0;
		int count = 0;
		
		while(true) {
			//키보드로 부터 입력
			do {
				System.out.print("1~100 정수 입력: ");
				n = sc.nextInt();
			}while(n>100 || n < 1);
			
			count++;
			
			if(re == n) {
				System.out.println(count +"번째 성공했습니다.");
				break;
			}else if(re < n) {
				System.out.println("Down!!!");
			}else if(re > n) {
				System.out.println("Up!!!");
			}
			
		}
		

	}

}












