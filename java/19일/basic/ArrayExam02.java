package kosta.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		//각 1차원 배열마다 2차원의 배열 크기 일정하게 생성
		int arr[][];//2차원 배열 선언
		arr = new int[3][2];//2차원 배열 생성
		
		//2차원 배열의 크기를 다르게 생성 방법
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		//2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1,2},{3,4},{5,6,7}};//int[3][2]
		
		//퀴즈 : 2차원배열 arr3의 내용을 중첩for문을 이용해서 출력해 보자.
		//arr3[0][0] = 1
		//arr3[0][1] = 2
		//arr3[1][0] = 3
		//.........
//		for(int i=0;i<arr3.length;i++) {
//			for(int j=0;j<arr3[i].length;j++) {
//				System.out.println("arr3["+i+"]["+j+"] =" + arr3[i][j]);
//			}
//		}
		
		//퀴즈> 구구단 전체 => 2차원배열에 초기화 후 전체를 출력
		//2 * 1 = 2

	}

}







