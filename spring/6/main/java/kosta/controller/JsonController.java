package kosta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kosta.model.Member;

@RestController
public class JsonController {
	
	static List<Member> list = new ArrayList<Member>();
	
	static {
		list.add(new Member("홍길동", 20, "가산"));
		list.add(new Member("박길동", 40, "강남"));
		list.add(new Member("조길동", 10, "안양"));		
	}
	
	@GetMapping("/member_list")
	public List<Member> member_list(){
		return list;
	}
	
	@GetMapping("/member_find")
	public Member member_find(@RequestParam("name") String name) {
		Member m = null;
		for(int i=0;i<list.size();i++) {			
			if(list.get(i).getName().equals(name)) {
				m = list.get(i);
				break;
			}
		}
		return m;
	}
	
	@PostMapping("/member_insert")
	public void member_insert(@RequestBody Member m) {
		list.add(m);
	}
	
	

}















