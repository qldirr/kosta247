package kosta.data;

import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		//기본 정렬 조건 : Comparable => compareTo() 오버라이딩
		//정렬 기준을 변경 : Comprator => compare() 오버라이딩
		
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Desending());
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);

	}

}








