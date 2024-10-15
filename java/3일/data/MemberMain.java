package kosta.data;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동", 30, "서울"));
		list.add(new Member("박길동", 30, "광주"));
		list.add(new Member("조길동", 30, "부산"));
		
		list.stream().forEach(member ->
			System.out.println(member.getName())
		);

	}

}







