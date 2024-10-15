package kosta.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//1. 1~10까지의 숫자를 배열에 초기화 후 전체를 출력해 보자.
		
		//2. 키보드로부터 정수를 입력 받아 해당 값까지 
		//2의배수 및 3의 배수만 출력해 보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력: ");
//		int num = sc.nextInt();
//		int arr [] = new int[num];
//		int count = 0;
//		
//		for(int i=1;i<=num;i++) {
//			if(i%2==0 || i%3==0) {
//				arr[count++] = i;
//			}
//		}
//		
//		for(int i=0;i<count;i++) {
//			System.out.print(arr[i] + ", ");
//		}
		
		//배열 값들 중에 최대값과 최소값을 구하시오.
//		int[] arr = {79, 88, 91, 100, 53, 95};
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}else if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		
		//배열 요소를 섞어 보기
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<100;i++) {
			int n = (int)(Math.random() * 10);
			int tmp = arr[n];
			arr[n] = arr[0];
			arr[0] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}









