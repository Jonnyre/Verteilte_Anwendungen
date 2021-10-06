package Aufgabe_02;

public class DispatcherThread extends Thread{

	private IDispatcher idispatcher;
	private int position;
	private Result result;
	
	public DispatcherThread(IDispatcher _idispatcher, int _position, Result _result) {
		this.idispatcher = _idispatcher;
		this.position = _position;
		this.result = _result;
	}
	
	public void run() {	
		this.result.setResult(this.idispatcher.iFunction(this.position), this.position);
	}
	
}
