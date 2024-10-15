package kosta.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		//배열 내용을 정렬
		int arr[] = {3,2,5};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[arr.length-1-i] + ", ");
//		}
		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] + ", ");
//		}
		
		int arr2[][] = {{2, 90},{1, 60},{3, 20}};//{1, 60},{2, 90},{3, 20}
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				//정렬기준 작성 : => 2차원 배열 안에 1차원 첫번째 인덱스를 기준으로 오름차순
				if(o1[0] < o2[0]) {
					return 1;
				}else if(o1[0] > o2[0]) {
					return -1;
				}else {
					return 0;	
				}				
			}			
		});		
		
		System.out.println(Arrays.deepToString(arr2));
		

	}

}











