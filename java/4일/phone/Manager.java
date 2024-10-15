package kosta.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	//PhoneInfo arr[] = new PhoneInfo[10];
	List<PhoneInfo> list = new ArrayList<PhoneInfo>();
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
			//arr[count++] = new PhoneInfo(name, phoneNo, birth);
			list.add(new PhoneInfo(name, phoneNo, birth));
			break;
		case "2":
			System.out.print("학과: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학년: ");
			String year = DataInput.sc.nextLine();
			
			//arr[count++] = new Universe(name, phoneNo, birth, major, year);
			list.add(new Universe(name, phoneNo, birth, major, year));
			break;
		case "3":
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직책: ");
			String position = DataInput.sc.nextLine();
			
			//arr[count++] = new Company(name, phoneNo, birth, dept, position);
			list.add(new Company(name, phoneNo, birth, dept, position));
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
//			for (int i = 0; i < count; i++) {
//				arr[i].show();
//			}
			for(int i=0;i<list.size();i++) {
				PhoneInfo info = list.get(i);
				info.show();
			}
			break;
		case "2":
//			for (int i = 0; i < count; i++) {
//				if(arr[i] instanceof Universe) {
//					arr[i].show();
//					//System.out.println(((Universe)arr[i]).getMajor());
//				}
//			}
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if(info instanceof Universe) {
					info.show();
				}
			}
			break;
		case "3":
//			for (int i = 0; i < count; i++) {
//				if(arr[i] instanceof Company) {
//					arr[i].show();
//				}
//			}
			for (int i = 0; i < list.size(); i++) {
				PhoneInfo info = list.get(i);
				if(info instanceof Company) {
					info.show();
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

//		for (int i = 0; i < count; i++) {
//			if (name.equals(arr[i].getName())) {
//				arr[i].show();
//				idx = i;
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}
	
	public void updatePhoneInfo() {
		//이름입력 => 해당 전화번호부 검색 => 수정 전화번호 입력 => 전화번호를 수정 완료
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

//		for (int i = 0; i < count; i++) {
//			if (name.equals(arr[i].getName())) {
//				System.out.print("수정할 전화번호: ");
//				String phoneNo = DataInput.sc.nextLine();
//				arr[i].setPhoneNo(phoneNo);
//				
//				idx = i;
//			}
//		}
		
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				System.out.print("수정할 전화번호: ");
				String phoneNo = DataInput.sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
			}
		}

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}
	
	public void deletePhoneInfo() {
		//이름입력 => 대상 객체 검색 => 인덱스 찾기 => 해당 대상 삭제(주의)
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < list.size(); i++) {
			PhoneInfo info = list.get(i);
			if (name.equals(info.getName())) {
				list.remove(info);
				idx = i;
				break;
			}
		}

//		for (int i = 0; i < count; i++) {
//			if (name.equals(arr[i].getName())) {
//				arr[i] = null;					
//				idx = i;
//			}
//		}
//		
//		if(idx != -1) {
//			for(int i=idx;i<count;i++) {
//				if(i == arr.length -1) {//마지막 위치
//					arr[i] = null;
//				}else {
//					arr[i] = arr[i+1];
//				}
//			}
//			count--;
//		}
		

		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}

	}
	
	public void savePhoneInfo() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phone.ser"));
			oos.writeObject(list);
			System.out.println("저장 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {}
		}
	}
	
	public void loadPhoneInfo() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("phone.ser"));
			list = (List<PhoneInfo>)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
	}
	
	
}













