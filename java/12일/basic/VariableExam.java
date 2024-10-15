package kosta.basic;

public class VariableExam {

	public static void main(String[] args) {
		//변수는 데이터를 담는 그릇
		//변수 선언 : 메모리 할당
		//데이터형 변수명; => 기본형 데이터형(primitive type) : byte, short, int, long, float, double, char, boolean
		
		int num;//메모리 할당(4byte 할당)		
		num = 10;//변수 초기화		
		//변수 사용
		System.out.println(num);
		
		//변수 선언, 초기화
		int num2 = 100;
		
		String str = "홍길동";
		System.out.println(str);
		
		//변수선언시 주의사항
		//변수명 특수문자X, 숫자로 시작X, 소문자, _
		//클래스명 첫문자 대문자 나머지는 소문자, 합성어 두번째 단어 첫문자 대문자
		//class HelloWorld
		
		//기본리터럴
		//10=> int, "안녕" => String, 'A' => char, true => boolean, 3.14 => double
		
		//형 변환(Casting)
		//byte < short < int < long < float < double
		double a = 10;//묵시적 형변환
		int b = (int)3.14;//강제 형변환 => 데이터 손실
		System.out.println(b);
		
        //퀴즈) 
		float num3 = 3.14f;
		long num4 = 100L;
		
//		double num5 = 3.14 +1;
//		System.out.println(num5);
//		if(num5 == 4.14) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		//char, String 형변환
		//int <==> char (아스키 코드)
		char num6 = 'B';
		System.out.println((int)num6);
		
		int num8 = 67;
		System.out.println((char)num8);
		
		for(int i=65;i<91;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		//int <== String
		String num9 = "2000";
		//주의사항 : 정수형 문자열이 아니면 NumberFormatException 발생한다.
		int num10 = Integer.parseInt(num9);
		int result = num10 + 100;
		System.out.println(result);
		
		//int ==> String
		int num11 = 10;
		String num12 = num11 + "";
		
		String num13 = String.valueOf(num11);
		
		//모든 기본형 데이터형은 String과 연수 후에 String으로 변환된다.
		String str2 = 7 + "7" + 7;
		System.out.println(str2);
		
		
	}

}








