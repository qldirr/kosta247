package kosta.oop;

import java.util.Scanner;

import kosta.phone.PhoneInfo;

public class AccountMain {
	public static void main(String[] args) {
		//1. 계좌발급  2. 전체출력 3.계좌조회 4.계좌입금 5.계좌출금 
		Scanner sc = new Scanner(System.in);
		Account arr[] = new Account[10];
		int count = 0;
		
		while(true) {
			System.out.println("1.계좌발급  2.전체출력 3.계좌조회 4.계좌입금 5.계좌출금 ");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				System.out.print("계좌번호: ");
				String accountNo = sc.nextLine();
				System.out.print("계좌주: ");
				String ownerName = sc.nextLine();
				System.out.print("잔액: ");
				int balance = Integer.parseInt(sc.nextLine());
				
				arr[count++] = new Account(accountNo, ownerName, balance);
				System.out.println("새로운 계좌을 발급 되었습니다.");
				break;
			case "2":
				for(int i=0;i<count;i++) {
					arr[i].printAccount();
				}
				break;
			case "3":
				System.out.print("계좌번호: ");
				accountNo = sc.nextLine();
				for(int i=0;i<count;i++) {
					if(accountNo.equals(arr[i].getAccountNo())) {
						arr[i].printAccount();
						break;
					}
				}
				
				break;
			case "4":
				System.out.print("계좌번호: ");
				accountNo = sc.nextLine();
				for(int i=0;i<count;i++) {
					if(accountNo.equals(arr[i].getAccountNo())) {
						System.out.print("입금액: ");
						int amount = Integer.parseInt(sc.nextLine());
						arr[i].deposit(amount);
						System.out.println("입금 완료");
						break;
					}
				}
				break;
			case "5":
				System.out.print("계좌번호: ");
				accountNo = sc.nextLine();
				for(int i=0;i<count;i++) {
					if(accountNo.equals(arr[i].getAccountNo())) {
						System.out.print("출금액: ");
						int amount = Integer.parseInt(sc.nextLine());
						
						try {
							arr[i].withdraw(amount);
							System.out.println("출금 완료");							
						} catch (Exception e) {
							e.printStackTrace();
						}				
						
						break;
					}
				}
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		//Account a = new Account();
		//Account account;//객체선언 : 클래스타입 : Account객체의 주소값만 저장 가능
		//account = new Account("1111-1111", "이길동", 500);//객체 생성(인스턴스화) : 인스턴스변수(객체)
		//Account account2 = new Account("2222-2222", "한길동", 40000);//객체선언,생성
		
		//Account account3 = new Account("3333-3333", "김길동", 500, 100);
		
		
//		account.accountNo = "1111-1111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
//		
//		account2.accountNo = "2222-2222";
//		account2.ownerName = "박길동";
//		account2.balance = 30000;
		
//		account.deposit(5000);
//		account.withdraw(500000);
//		
//		System.out.println("계좌번호: " + account.accountNo);
//		System.out.println("계좌주: " + account.ownerName);
//		System.out.println("잔액: " + account.balance);
//		System.out.println();
//		System.out.println("계좌번호: " + account2.accountNo);
//		System.out.println("계좌주: " + account2.ownerName);
//		System.out.println("잔액: " + account2.balance);
//		System.out.println();
		
		
	}

}
