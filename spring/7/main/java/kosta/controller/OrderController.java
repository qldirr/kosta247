package kosta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kosta.model.Order;
import kosta.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/orderForm")
	public String orderForm() {
		return "transaction/orderForm";
	}
	
	@PostMapping("/orderAction")
	public String orderAction(Order order) {
		String view = "transaction/orderOk";
		
		try {
			service.orderAction(order);
		} catch (Exception e) {
			view = "transaction/orderForm";
		}
		
		return view;
	}
}















