package kosta.order;

public class Fruit {
	private String no;
	private String fruitName;
	private int price;
	
	public Fruit() {}

	public Fruit(String no, String fruitName, int price) {
		super();
		this.no = no;
		this.fruitName = fruitName;
		this.price = price;
	}
	
	public void fruitPrint() {
		System.out.println(no + "\t" + fruitName + "\t" + price + "원");
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
}
