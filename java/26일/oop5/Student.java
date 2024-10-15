package kosta.oop5;

public class Student extends Man {

	public Student(String name){
		super(name);
	}
	
	public String speak(){
		return getName() + " 공부나 열심히해";
	}
}
