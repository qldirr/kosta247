package kosta.bank;

public class Customer {
	private String id;
	private String name;
	private Account account;
	
	public Customer() {}
	
	public Customer(String id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.account = new Account(id, balance);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
