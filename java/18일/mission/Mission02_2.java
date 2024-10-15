package kosta.mission;

public class Mission02_2 {

	public static void main(String[] args) {
		//성적관리프로그램에서 여러명의 성적을 구현해 보자.
		//번호	국어	영어	수학	총점	평균
		//	1	90	80	70	240	80
		//	2	50	40	30	120	40
		//====================
		//        140  120  100
		//         70     80    50
		int[][] score = {
				{90, 98,91},
				{21,45,43},
				{60,70,42}
		};
		
		//과목별 총점 변수 선언
		int korTotal = 0, engTotal = 0, matTotal = 0;

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0;i<score.length;i++) {
			int sum = 0;
			int avg = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1)+"\t");			
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			
			avg = sum/score[i].length;//2차원배열의 크기만큼 나누기(과목수 만큼)
			System.out.print(sum + "\t");
			System.out.print(avg + "\t");
			System.out.println();
		}
		
		System.out.println("========================");
		System.out.print("\t" + korTotal);
		System.out.print("\t" + engTotal);
		System.out.print("\t" + matTotal);
		System.out.println();
		
		System.out.print("\t" + korTotal/score.length);
		System.out.print("\t" + engTotal/score.length);
		System.out.print("\t" + matTotal/score.length);
		
		
	}

}







