package kosta.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.햄버거 2.콜라 3.피자 4.기타");
		
		System.out.print("메뉴선택: ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("햄버거 선택");
			break;
		case 2:
			System.out.println("콜라 선택");
			break;
		case 3:
			System.out.println("피자 선택");
			break;
		default:
			System.out.println("기타 선택");
			break;
		}
		
	}

}
