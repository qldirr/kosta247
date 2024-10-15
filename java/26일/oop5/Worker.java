package kosta.oop5;

public class Worker extends Man implements Speakeable {

	public Worker(String name){
		super(name);
	}
	
	@Override
	public String speak() {		
		return getName() + " 열심히 일해야 한다.";
	}

}
