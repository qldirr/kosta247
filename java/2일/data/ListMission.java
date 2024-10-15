package kosta.data;

import java.util.LinkedList;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		//List 자료구조를 활용하여 키보드로 부터 문자열을 입력 받아 처리하자.
		//1. 데이터 추가 2. 데이터 삭제   3. 전체출력
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		
		while(true) {
			System.out.println("1. 데이터 추가 2. 데이터 삭제   3. 전체출력");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			int idx = -1;
			
			switch (menu) {
			case "1":
				System.out.print("추가: ");
				list.add(sc.nextLine());
				break;
			case "2":
				System.out.print("삭제: ");
				idx = list.indexOf(sc.nextLine());
				if(idx != -1) {
					list.remove(idx);
				}
				break;
			case "3":
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i) + ", ");
				}
				System.out.println();
				break;
			}
		}
		

	}

}








