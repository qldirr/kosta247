package kosta.basic;

public class ExceptionExam {

	public static void noEquals(int a, int b)throws Exception {		
		if(a == b) {
			throw new Exception("같은 값");
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			noEquals(10, 20);
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");
		}
		
		System.out.println("5");
		System.out.println("done.....");
		
//		int a = 10;
//		int b = 0;
//		
//		try {
//			int r = a/b;//ArithmeticException 예외 발생
//		}catch(Exception e) {
//			//System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
//		System.out.println("done...");

	}

}










