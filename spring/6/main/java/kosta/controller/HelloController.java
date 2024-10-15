package kosta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService service;	
	
	public void setService(HelloService service) {
		this.service = service;
	}

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", service.getMessage());
		mav.setViewName("hello");
		
		return mav;
	}
	
	@RequestMapping("hello2.do")
	public String hello2(Model model) {
		model.addAttribute("message", "Hello Spring!!!");
		
		return "hello";
	}


}








