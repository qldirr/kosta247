package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListMission2 {

	public static void main(String[] args) {
		//로또번호 1~45 중복되지 않는 정수 6개를 출력하자.
		Random r= new Random();		
		//1. 배열로 구현
//		int arr[] = new int[6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j=0;j<i;j++) {
//				if(arr[i] == arr[j]) {
//					i = i - 1;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//2. List로 구현 : contains(정수) => true/false
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45) + 1;
//			if(list.contains(n)) {
//				continue;
//			}else {
//				list.add(n);
//			}
//			
//			if(list.size() == 6) break;
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		//3. Set 자료구조 구현
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);
				

	}

}







