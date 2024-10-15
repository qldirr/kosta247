package kosta.oop;

public class Account {
	 //계좌객체
	 //상태(데이터):  계좌번호, 계좌주, 잔액 => 멤버변수
	 //행동(기능):  입금하다. 출금하다.  => 메서드
	String accountNo;//계좌번호
	String ownerName;//계좌주
	int balance;//잔액
	
	public Account() {}//디폴트 생성자
		
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	

	//입금하다.
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금하다.
	public int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}		
		balance -= amount;
		
		return amount;
	}
	
}







