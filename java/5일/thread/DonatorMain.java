package kosta.thread;

public class DonatorMain {

	public static void main(String[] args) {
		//Donator => 1000원 => 10만원 까지 모금
		Collect c = new Collect();
		
		for(int i=0;i<200;i++) {
			Thread t = new Donator(1000, c);
			t.start();
		}
	}

}
