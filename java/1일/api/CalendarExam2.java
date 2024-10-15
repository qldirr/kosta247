package kosta.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarExam2 {

	public static void main(String[] args) {
		//입사일을 입력 => 몇년 몇개월 근무 중
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 " + pattern + "의 형태로 입력해 주세요.(ex:2022/07/28)");
		Date inDate = null;
		
		while(sc.hasNextLine()) {
			try {
				inDate	= df.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);//입사일로 이동
		Calendar today = Calendar.getInstance();//오늘 날짜
		
		//총일수
		long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(24*60*60*1000);
		int m = (int)(day/30);//총월
		int year = m/12;//총년
		int month = m%12;
		
		System.out.println("결과: " + year + "년 " + month + "개월 근속");
	}

}








