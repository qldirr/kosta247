package kosta.phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
			
		//Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.정렬 7.저장 8.불러오기 9.종료");
			System.out.print("메뉴: ");
			String menu = DataInput.sc.nextLine();
			
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "7":
				m.savePhoneInfo();
				break;
			case "8":
				m.loadPhoneInfo();
				break;
			case "9":
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		
		
		
		//PhoneInfo info1 = new PhoneInfo("홍길동", "010-1111-111", "02/12/31");
		//PhoneInfo info2 = new PhoneInfo("박길동", "010-2222-222", "04/12/31");
//		PhoneInfo arr[] = {
//				new PhoneInfo("홍길동", "010-1111-111", "02/12/31"),//arr[0]
//				new PhoneInfo("박길동", "010-2222-222", "04/12/31")//arr[1]
//		};
//		
//		for(PhoneInfo info : arr) {
//			info.show();
//		}
				
//		info1.show();
//		info2.show();

	}

}







