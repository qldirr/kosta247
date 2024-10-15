package kosta.mission;

import java.util.Scanner;

public class Mission07_1 {	
	static int count = 0;
	
	public static void add(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력");
		arr[count++] = sc.nextLine();
	}
	
	public static void print(String arr[]) {
		for(int i=0;i<count;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
	
	public static void serarch(String arr[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색 문자열 입력: ");
		String search = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(search.equals(arr[i])) {
				idx = i;
				break;
			}
		}		
		if(idx == -1) {
			System.out.println("해당 문자열은 존재하지 않습니다.");
		}else {
			System.out.println((idx+1) + "번째 있습니다.");
		}
	}
	
	public static void update(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 대상 문자열: ");
		String str = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(str.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			System.out.println("수정 대상 문자열이 없습니다.");
		}else {
			System.out.print("수정 문자열: ");
			arr[idx] = sc.nextLine();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strr[] = new String[10];
		int count = 0;

		while (true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.종료");
			System.out.print("메뉴 입력: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				add(strr);
//				System.out.print("문자열 입력: ");
//				String str = sc.nextLine();
//				strr[count++] = str;
				break;

			case "2":
				print(strr);
//				for (int i = 0; i < count; i++) {
//					System.out.print(strr[i] + ", ");
//				}
//				System.out.println();
				break;
			case "3":
				serarch(strr);
//				System.out.print("검색 문자열 입력: ");
//				String search = sc.nextLine();
//				int idx = -1;
//				
//				for(int i=0;i<count;i++) {
//					if(search.equals(strr[i])) {
//						idx = i;
//						break;
//					}
//				}
//				
//				if(idx == -1) {
//					System.out.println("해당 문자열은 존재하지 않습니다.");
//				}else {
//					System.out.println((idx+1) + "번째 있습니다.");
//				}
				
				break;
			case "4":
				update(strr);
				break;
			case "5":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}





