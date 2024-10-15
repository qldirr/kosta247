package kosta.phone;

import java.util.Scanner;

public class Manager {
	PhoneInfo arr[] = new PhoneInfo[10];
	Scanner sc = new Scanner(System.in);
	int count = 0;

	public void addPhoneInfo() {		
		//키보드로 부터 이름, 전화번호, 생년월일 입력 받아
		//PhoneInfo객체를 생성후 배열에 추가해 준다.
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		//PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
		//arr[count++] = info;
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
				
	}
	
	public void listPhoneInfo() {
		//배열에 있는 모든 PhoneInfo객체의 내용을 출력한다.
		for(int i=0;i<count;i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneInfo() {
		//검색하고자 하는 이름으로 1개의 PhoneInfo객체의 내용을 출력한다.
		System.out.print("이름: ");
		String name = sc.nextLine();	
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			if(name.equals(arr[i].name)) {
				arr[i].show();
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
		
	}
}







