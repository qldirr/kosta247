package kosta.basic;

public class MethodExam {
	
	//메서드 정의
	//접근제어자, (static), 리턴형(void), 메서드이름(파라미터(인자)매개변수)
	public static void printCharacter(char ch, int num) {
		for(int i =1;i<=num;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	//두 정수를 메서드 파라미터를 통해 입력 받아 합을 출력하시오.
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		//System.out.println("합: " + sum);
		return sum;
	}	
	//메서드 호출시 반드시 파라미터 내용을 확인해야 한다.

	public static void main(String[] args) {
		int result = add(10,20);
		System.out.println("result: " + result);
		
		
		//특정 문자를 여러번 출력하자.
		//메서드 호출
		printCharacter('%', 15);
		
		System.out.println("AAAAAAA");		
		
		printCharacter('#', 20);
		
		System.out.println("BBBBBBB");

		printCharacter('?', 30);
		
		add(100, 200);
	}

}
