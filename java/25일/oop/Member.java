package kosta.oop;

public class Member {
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	
	public Member() {}	//new Member();
	
	//new Member("홍길동", 20, "111-111", "가산동");
	public Member(String name, int age, String phoneNo, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public void print() {
		System.out.println("회원명: " + name);
		System.out.println("회원 나이: " + age);
		System.out.println("회원 전화번호: " + phoneNo);
		System.out.println("회원 주소: " + address);
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}















