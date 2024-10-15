package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account a = new Account();
		Account account;//객체선언 : 클래스타입 : Account객체의 주소값만 저장 가능
		account = new Account("1111-1111", "이길동", 500);//객체 생성(인스턴스화) : 인스턴스변수(객체)
		Account account2 = new Account("2222-2222", "한길동", 40000);//객체선언,생성
		
		//Account account3 = new Account("3333-3333", "김길동", 500, 100);
		
		
//		account.accountNo = "1111-1111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
//		
//		account2.accountNo = "2222-2222";
//		account2.ownerName = "박길동";
//		account2.balance = 30000;
		
		account.deposit(5000);
		account.withdraw(500000);
		
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("계좌주: " + account.ownerName);
		System.out.println("잔액: " + account.balance);
		System.out.println();
		System.out.println("계좌번호: " + account2.accountNo);
		System.out.println("계좌주: " + account2.ownerName);
		System.out.println("잔액: " + account2.balance);
		System.out.println();
		
		
	}

}
