package kosta.data;

import java.util.Comparator;

public class Desending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//내림차순 정렬기준 정의
		if(o1 < o2) {
			return 1;
		}else if(o1 > o2) {
			return -1;
		}
		return 0;
	}

}







