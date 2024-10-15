package kosta.game;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		BaseBall bb = new BaseBall();
		Scanner sc = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int input[] = new int[3];
		
		do {
			System.out.println("게임도전");
			System.out.print("숫자 입력: ");
			for(int i=0;i<3;i++) {
				input[i]= sc.nextInt();
			}
			
			strike = bb.countStrike(input);
			ball = bb.countBall(input);
			
			System.out.println(strike +"S " + ball + "B");
			count++;
			
		}while(strike != 3);
		
		System.out.println(count + "번째 성공했습니다.!!!");
	}
}













