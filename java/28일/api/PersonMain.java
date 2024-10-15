package kosta.api;

public class PersonMain {
	//Person  equals()X  => Object equals() : 주소값을 비교
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 21);
		Person p2 = new Person("홍길동", 20);
		
		if(p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

	}

}
