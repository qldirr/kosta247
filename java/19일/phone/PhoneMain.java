package kosta.phone;

public class PhoneMain {

	public static void main(String[] args) {
		//PhoneInfo info1 = new PhoneInfo("홍길동", "010-1111-111", "02/12/31");
		//PhoneInfo info2 = new PhoneInfo("박길동", "010-2222-222", "04/12/31");
		PhoneInfo arr[] = {
				new PhoneInfo("홍길동", "010-1111-111", "02/12/31"),//arr[0]
				new PhoneInfo("박길동", "010-2222-222", "04/12/31")//arr[1]
		};
		
		for(PhoneInfo info : arr) {
			info.show();
		}
				
//		info1.show();
//		info2.show();

	}

}







