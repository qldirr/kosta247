package kosta.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10];
	// Scanner sc = new Scanner(System.in);
	int count = 0;

	public void addPhoneInfo() {
		// 1.일반 2.동창 3.직장
		System.out.print("1.일반 2.동창 3.직장");
		System.out.print("선택: ");
		String menu = DataInput.sc.nextLine();

		// 키보드로 부터 이름, 전화번호, 생년월일 입력 받아
		// PhoneInfo객체를 생성후 배열에 추가해 준다.
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();

		switch (menu) {
		case "1":
			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			break;
		case "2":
			System.out.print("학과: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학년: ");
			String year = DataInput.sc.nextLine();
			
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		case "3":
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직책: ");
			String position = DataInput.sc.nextLine();
			
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;
		}

		

		// PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
		// arr[count++] = info;
		

	}

	public void listPhoneInfo() {
		// 1.일반 2.동창 3.직장
		System.out.print("1.일반 2.동창 3.직장");
		System.out.print("선택: ");
		String menu = DataInput.sc.nextLine();

		switch (menu) {
		case "1":
			// 배열에 있는 모든 PhoneInfo객체의 내용을 출력한다.
			for (int i = 0; i < count; i++) {
				arr[i].show();
			}
			break;
		case "2":
			for (int i = 0; i < count; i++) {
				if(arr[i] instanceof Universe) {
					arr[i].show();
					//System.out.println(((Universe)arr[i]).getMajor());
				}
			}
			break;
		case "3":
			for (int i = 0; i < count; i++) {
				if(arr[i] instanceof Company) {
					arr[i].show();
				}
			}
			break;
		}

		
	}

	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}
}
