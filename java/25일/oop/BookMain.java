package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		int total = 0;
		
		Book arr[] = {
				new Book("Java", 30000),
				new Book("JSP", 20000),
				new Book("Oracle", 15000)
		};
		
		for(Book b : arr) {
			b.discount();
			b.printBook();
			total += b.dc_price;
		}
		
		System.out.println("총합: " + total + "원");
		
	}

}







