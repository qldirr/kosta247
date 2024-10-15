package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {
	
	//메서드 정의
	public static void total(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[3] += arr[i];
		}
	}	
	public static void avreage(int arr[]) {
		arr[4] = arr[3]/3;
	}	
	public static void main(String[] args) {
		//국영수 프로그램을 배열로 변환하자.
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"};
		int arr[] = new int[5];
		
		for(int i=0;i<3;i++) {
			System.out.print(subject[i] + " 입력: ");
			arr[i] = sc.nextInt();
			//arr[3] += arr[i];
		}
		
		total(arr);		
		//arr[4] = arr[3]/3;
		avreage(arr);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int n : arr) {
			System.out.print(n+"\t");
		}	

	}

}









