package kosta.oop;

public class CheckingAccount extends Account {
	private String cardNo;	

	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}	

	@Override
	public void printAccount() {		
		super.printAccount();
		System.out.println("카드번호: " + cardNo);
	}

	public int pay(String carNo, int amount)throws Exception {
		if(!cardNo.equals(this.cardNo) ||  getBalance() < amount) {
			throw new Exception("결재불능");
		}
		
		return withdraw(amount);
	}
	

}





