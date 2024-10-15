package kosta.phone;

public class PhoneInfo {
	//상태: 이름, 전화번호, 생년월일(name, phoneNo, birth)
	//기능 : 전호번호 내역을 출력(show)
	String name;
	String phoneNo;
	String birth;
	
	public PhoneInfo() {}
		
	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("생년월일: " + birth);
		System.out.println();
	}
}
