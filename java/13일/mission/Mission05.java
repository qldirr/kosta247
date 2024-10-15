package kosta.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//로그인 예제를 구현해 보자(equals())
		//id, pass 키보드로 부터 입력
		//id, pass 모두 일치하면 => 로그인 성공
		//id가 불일치 => 해당 아이디가 존재하지 않습니다.
		//pas가 불일치 => 비밀번호가 일치하지 않습니다.
		
		String m_id = "kosta";
		String m_pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pass = sc.nextLine();
		
		if(id.trim().equals(m_id) && pass.trim().equals(m_pass)) {
			System.out.println("로그인 성공");
		}else {
			if(!id.equals(m_id)) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}
}


















