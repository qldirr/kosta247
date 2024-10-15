package kosta.oop;

public class Board {
	int seq;
	String title;
	String writer;
	
	public Board() {}
	
	public void show() {
		System.out.print(seq + "\t");
		System.out.print(title + "\t\t");
		System.out.print(writer + "\t");
		System.out.println();
	}
}
