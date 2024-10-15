package kosta.order;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private String name;
	private List<Fruit> fruits;
	
	public Cart() {}

	public Cart(String name) {
		super();
		this.name = name;
		fruits = new ArrayList<Fruit>();
	}
	
	public void addCart(Fruit fruit) {
		fruits.add(fruit);
	}
	
	public void cartList() {
		int totalPrice = 0;
		System.out.println("이름: " + name);
		for(Fruit fruit : fruits) {
			fruit.fruitPrint();
			totalPrice += fruit.getPrice();
		}
		System.out.println("총액: " + totalPrice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}
	
	
	
	
}
