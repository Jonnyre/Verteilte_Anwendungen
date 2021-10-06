package Aufgabe_02;

import java.util.Arrays;

public class Dispatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(Dispatcher.execute((x) -> x*x, 5)));
	}
	
	public static int[] execute(IDispatcher idispatcher, int max) {
		Result resultObject = new Result(max - 1);
		for(int i = 0; i < max - 1; i++) {
			
			DispatcherThread dispatcherThread = new DispatcherThread(idispatcher, i, resultObject);
			dispatcherThread.start();	
		}
		
		return resultObject.getResult();
	}

}
