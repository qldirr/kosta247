package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		//GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		
		//System.out.println(gc);
		String now = gc.get(Calendar.YEAR) + "년 "
							+ (gc.get(Calendar.MONTH)+1) + "월 "
							+ gc.get(Calendar.DATE) + "일 "
							+ gc.get(Calendar.HOUR) + "시 "
							+ gc.get(Calendar.MINUTE) + "분";
		
		System.out.println("현재시간 : " + now);
		
		gc.add(Calendar.DATE, 100);
		
		String future = gc.get(Calendar.YEAR) + "년 "
				+ (gc.get(Calendar.MONTH)+1) + "월 "
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분";
		
		System.out.println("100일 후 : " + future);
		
		gc.set(2022, 6, 11);//7월 11일
		gc.add(Calendar.DATE, 100);
		
		SimpleDateFormat dateFormat =
				new SimpleDateFormat("yyyy/MM/dd hh:mm");
		String str = dateFormat.format(gc.getTime());//Calendar -> Date
		System.out.println(str);
		
		//2022 ~ 2030년 까지 자신의 생일 요일 ?
		char[] week = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i=2022;i<=2030;i++) {
			gc.set(i, 6, 28);//7월28일
			char c = week[gc.get(Calendar.DAY_OF_WEEK) -1];
			System.out.println(i + "년의 생일은 " + c + "요일 입니다.");
		}
	}

}










