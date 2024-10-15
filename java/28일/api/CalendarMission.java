package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
		//2022년 7월 달력 만들기
		//<2022년 7월>
		//일	월	화	수	목	금	토
		// 					1	2
		//3	4	5	6	7	8	9
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		//System.out.println(n);//31
		gc.set(2022, 6, 1);//2022년 7월1일 이동
		int week = gc.get(Calendar.DAY_OF_WEEK);//1 ~ 7 =>6
		
		System.out.println("<2022년 7월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		
		for(int i=1;i<=n;i++) {
			System.out.print(i +"\t");
			if((week + i - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}

}






