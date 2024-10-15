package kosta.phone;

public class Company extends PhoneInfo{
	private String dept;
	private String position;
	
	public Company() {}

	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("부서: " + dept);
		System.out.println("직책: " + position);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}





