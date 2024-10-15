package kosta.bean;

import java.util.Arrays;

public class Member {
	private String name;
	private String address;
	private String hobby[];
	
	public Member() {}

	public Member(String name, String address, String[] hobby) {
		super();
		this.name = name;
		this.address = address;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", hobby=" + Arrays.toString(hobby) + "]";
	}

	
	
	
}
