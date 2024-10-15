package kosta.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		//이름, 점수를 한쌍으로 Map 자료구조로 구현하자. => 김자바 : 80, 박자바 : 90
		//1. 시험 응시자만 출력
		//2. 총점, 평균, 최고점수, 최저점수 : Collections => max(), min()
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김자바", 90);
		map.put("박자바", 80);
		map.put("이자바", 50);
		map.put("곽자바", 85);
		map.put("정자바", 70);
		map.put("윤자바", 65);
		
		//map => key추출
		Set<String> set = map.keySet();
		System.out.println("응시명단: " + set);
		
		//map => value추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total = 0;
		while(iter.hasNext()) {
			total += iter.next();
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/map.size());
		System.out.println("최고점: " + Collections.max(values));
		System.out.println("최저점: " + Collections.min(values));
		
	}

}








