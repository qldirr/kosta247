package kosta.oop2;

public class Main {

	public static void main(String[] args) {
		//Role role = new Role();
		
		Study study = new Study();
		Work work = new Work();
		
		Person p = new Person("홍길동", work);
		
		p.doIt();

	}

}
