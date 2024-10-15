package kosta.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		
//		Account ch =
//				new CheckingAccount("111-111", "홍길동", 1000, "111-111");
		
		Account ch =
				new Account("111-111", "홍길동", 1000);
		
		try {
			if(ch instanceof CheckingAccount) {
				CheckingAccount ch2 = (CheckingAccount)ch;
				ch2.pay("111-111", 300);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ch.printAccount();
		
//		MinusAccount ma =
//				new MinusAccount("111-111", "김길동", 5000, 10000);
//		
//		try {
//			System.out.println("인출금액: " + ma.withdraw(8000));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		CheckingAccount ch =
//				new CheckingAccount("111-111", "홍길동", 1000, "111-111");
//		
//		try {
//			ch.pay("111-111", 800);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		ch.printAccount();
		
	}

}
