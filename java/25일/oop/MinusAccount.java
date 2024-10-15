package kosta.oop;

public class MinusAccount extends Account {
	private int creditLine;//마이너스 한도
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override
	public int withdraw(int amount) throws Exception {
		if(getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		}
		
		int balance = getBalance();
		setBalance(balance - amount); 
		
		return amount;
	}

	public int getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	//메서드 오버라이딩 : 부모 메서드의 시그너처 일치(리턴형, 메서드이름, 파라미터(개수, 데이터형))
	//부모의 메서드의 내용이 부적합해서 자식이 다시 메서드를 정의함
	

}






