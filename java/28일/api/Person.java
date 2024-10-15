package kosta.api;

public class Person {
	private String name;
	private int age;
	
	public Person() {}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(name.equals(p.getName()) && age == p.getAge()) {
			return true;
		}else {
			return false;
		}
		
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
	
	
}
