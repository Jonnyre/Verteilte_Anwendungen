package Aufgabe_02;

public class Result {

	private int[] result;
	private int max;
	private int counter = 0;
	
	public Result(int _max) {
		this.max = _max;
		this.result = new int[_max];
	}
	
	public synchronized int[] getResult() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.result;
	}
	
	public synchronized void setResult(int _value, int _position) {
		this.result[_position] = _value;
		this.counter++;
		
		if(this.counter == this.max) {
			notifyAll();
		}
	}
}
