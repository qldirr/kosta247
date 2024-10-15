package kosta.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		//m.name = "홍길동";//해결 : 캡슐화(정보은닉) 처리=> set, get메서드 사용
		//m.age = 20;
		
		m.setName("홍길동");
		m.setAge(20);
		
		System.out.println("이름: " + m.getName());
		System.out.println("나이: " + m.getAge());
		
		
		
		// 객체생성(인스턴스화)
		//Member m1  = new Member("홍길동", 20, "1111", "가산");
		//m1.print();
		
//		Member arr[] = new Member[1];
//		arr[0] = new Member("홍길동", 20, "1111", "가산");
		
//		Member arr2[] = {
//				new Member("홍길동", 20, "1111", "가산"),
//				new Member("박길동", 30, "4444", "강남")
//		};
//		
//		for(int i=0;i<arr2.length;i++) {
//			arr2[i].print();
//		}
	
	}

}









