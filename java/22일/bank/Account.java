package kosta.bank;

public class Account {
	private String id;
	private long balance;
	
	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		balance += amount;
	}
	
	public boolean withdraw(long amount) {
		if(balance < amount) {
			return false;
		}
		balance -= amount;
		
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
}
