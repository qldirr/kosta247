package kosta.basic;

public class CallByExam {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int brr[] = arr;
		
		brr[0] = 100;
		
		System.out.println(arr[0]);

	}

}
