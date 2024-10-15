package kosta.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AopController {
	
	@GetMapping("/session_req")
	public String session_req() {
		return "session/session_req";
	}
	
	@GetMapping("/session_do")
	public String session_do(HttpServletRequest request) {
		return "session/session_success";
	}
	
	@GetMapping("/session_add")
	public String session_add() {
		return "session/session_add";
	}
	
	@GetMapping("/session_test")
	public String sessionTest_do(HttpServletRequest request) {
		return "session/session_test";
	}
}




