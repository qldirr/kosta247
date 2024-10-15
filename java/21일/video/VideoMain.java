package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
		Video v1 = new Video("1", "탑건", "톰크루즈");
		Video v2 = new Video("2", "경관의피", "조진웅");
		
		GeneralMember m1 =
				new GeneralMember("aa", "홍길동", "가산동");
		
		//m1.setRentalVideo(v1);
		m1.rental(v1);
		m1.rental(v2);
		
		m1.show();
	}

}
