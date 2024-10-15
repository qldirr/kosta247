package kosta.mission;

import java.util.Scanner;

public class Mission07_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strr[] = new String[10];
		int count = 0;

		while (true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			System.out.print("메뉴 입력: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				System.out.print("문자열 입력: ");
				String str = sc.nextLine();
				strr[count++] = str;
				break;

			case "2":
				for (int i = 0; i < count; i++) {
					System.out.print(strr[i] + ", ");
				}
				System.out.println();
				break;
			case "3":
				System.out.print("검색 문자열 입력: ");
				String search = sc.nextLine();
				int idx = -1;
				
				for(int i=0;i<count;i++) {
					if(search.equals(strr[i])) {
						idx = i;
						break;
					}
				}
				
				if(idx == -1) {
					System.out.println("해당 문자열은 존재하지 않습니다.");
				}else {
					System.out.println((idx+1) + "번째 있습니다.");
				}
				
				break;
			case "4":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}





