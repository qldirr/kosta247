package kosta.data;

public class Food {
	private String foodName;
	private int price;
	
	public Food() {}

	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	
	public void show() {
		System.out.println("음식명: " + foodName);
		System.out.println("가격 : " + price);
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
