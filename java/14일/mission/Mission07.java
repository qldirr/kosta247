package kosta.mission;

import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴의 명령문을 실행해 보자.
		//1.추가 2.출력 3.검색 4.종료
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.print("메뉴 입력: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.println("추가 선택");
				break;
			case "2":
				System.out.println("출력 선택");
				break;
			case "3":
				System.out.println("검색 선택");
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}












