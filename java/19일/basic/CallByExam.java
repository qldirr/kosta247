package kosta.basic;

public class CallByExam {
	
	public static int change(int num) {
		num += 10;
		return num;
	}
	
	public static void change2(int brr[]) {
		brr[0] += 200;
	}

	public static void main(String[] args) {
		int num = 10;
		num = change(num);
		System.out.println("num: " + num);
		
		int arr[] = {100}; 
		change2(arr);//call by reference
		System.out.println("arr: " + arr[0]);
		
		
		
//		int arr[] = {1,2,3};
//		int brr[] = arr;
//		
//		brr[0] = 100;
//		
//		System.out.println(arr[0]);

	}

}
