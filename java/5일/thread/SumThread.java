package kosta.thread;

public class SumThread extends Thread {
	private int start;
	private int end;
	private int sum;
	
	public SumThread() {}	

	public SumThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			sum += i;
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
}
