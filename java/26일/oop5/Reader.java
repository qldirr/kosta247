package kosta.oop5;

public class Reader extends Man implements Speakeable {

	public Reader(String name){
		super(name);
	}
	
	@Override
	public String speak() {
		return getName()+"자바화이팅";
	}

}
