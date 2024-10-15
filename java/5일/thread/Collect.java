package kosta.thread;

public class Collect {
	private int total;//10만원
	
	public void add(Thread t, int amount) {
		total += amount;		
		System.out.println("모금 금액: " + total);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
}
