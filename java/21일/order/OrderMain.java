package kosta.order;

import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
		//주문 관리 프로그램
		Scanner sc = new Scanner(System.in);
		Fruit arr[] = {
				new Fruit("1", "사과", 500),
				new Fruit("2", "포도", 1000),
				new Fruit("3", "수박", 5000)
		};
				
		Cart cart = new Cart("홍길동");
		
		while(true) {
			System.out.println("1.장바구니 추가 2.장바구니 목록");
			//1. 구매 후 제품목록 출력 한다.
			//1.사과 500원   2.포도 1000  3.수박 5000
			//입력>3
			//Fruit  => Cart 추가되도록 하자.
			//2.장바구니 목록 선택
			//Cart에 있는 모든 Fruit객체 목록을 출력하고 전체 총액도 출력하자.
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				for(Fruit fruit : arr) {
					fruit.fruitPrint();
				}
				
				System.out.print("과일 선택 : ");
				String no = sc.nextLine();
				
				for(int i=0;i<arr.length;i++) {
					if(no.equals(arr[i].getNo())) {
						cart.addCart(arr[i]);
					}
				}
				System.out.println("카트에 추가 되었습니다.");
				break;
			case "2":
				cart.cartList();
				break;
			}
		}

	}

}







