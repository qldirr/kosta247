package kosta.mission2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2_1 {
	
	public static ArrayList<Integer> solution(int n, int arr[]){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[i] > arr[i-1]) answer.add(arr[i]);
		}		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//6
		int arr[] = new int[n];//배열 생성
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(n, arr)) {
			System.out.print(x + ", ");
		}
	}

}






