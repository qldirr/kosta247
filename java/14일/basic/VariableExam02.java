package kosta.basic;

public class VariableExam02 {

	public static void main(String[] args) {
		//지역변수(로컬변수) 특징 2가지
		//1. 반드시 초기화 후 사용해야 한다.
		//2. 선언된 변수는 정의된 범위 안에서만 사용이 가능하다.
		//   ->특정메서드 및 블럭 안에서 선언된 변수는 그 범위 안에서만 사용이 가능하다.
		int num = 0;
		
		num = num +1;
		System.out.println(num);
		
		//지역변수는 선언된 위치가 매우 중요하다. => 변수의 사용범위가 결정하기 때문
		int a=0;
		if(num == 1) {
			a = 100;
		}
		
		System.out.println("a: " + a);
		
		int i=1;
		for(;i<=10;i++) {
			//System.out.print(i +", ");
		}
		
		System.out.println("최종결과: " + i);
		
		//변수사용해야할 때
		//1. 어떤 종류의 데이터?
		//2. 해당 데이터를 어디에서 사용?
		
		//전치증감자 or 후치증감자
		int x = 10;
		int y = 0;
		
	    y = ++x;
		
		//System.out.println("x: " + x);
		//System.out.println("y: " + y);
	    
//	    int num2 = 0;
//	    num2 = num2 + 1;
//	    System.out.println("num2 :" +num2);
	    
	    //복합 대입 연산자
	    int num2 = 0;
	    num2 += 1;
	    System.out.println("num2 :" +num2);
	    
//	    int num2 =0;
//	    num2++;
//	    System.out.println("num2 :" +num2);
		
	}

}








