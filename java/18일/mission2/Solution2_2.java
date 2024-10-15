package kosta.mission2;

import java.util.Scanner;

public class Solution2_2 {
	
	public static int solution(int n, int arr[]) {
		int answer = 1;
		int max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}		
		return answer;
	}
	//130 135 148 140 145 150 150 153
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//8
		int arr[] = new int[n];//배열 생성
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, arr));

	}

}






