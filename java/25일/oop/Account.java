package kosta.oop;

public class Account {
	 //계좌객체
	 //상태(데이터):  계좌번호, 계좌주, 잔액 => 멤버변수
	 //행동(기능):  입금하다. 출금하다.  => 메서드
	private String accountNo;//계좌번호
	private String ownerName;//계좌주
	private int balance;//잔액
	
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
	public int withdraw(int amount)throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족 합니다.");
		}		
		balance -= amount;
		
		return amount;
	}
	
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}







