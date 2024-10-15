package kosta.bank;

public class MyBank {
	private Customer customers[];
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		for(int i=0;i<customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}
	
	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
		
//		for(int i=0;i<customersNum;i++) {
//			newCustomers[i] = customers[i];
//		}
		
			System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		
		return newCustomers;
	}
	
}









