package Aufgabe_01;

public class Eieruhr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eieruhr.eieruhr(10, "Eieralarm");
		
	}
	
	public static void schlafen(int m) {
		try { Thread.sleep(1000*m);
		} catch (InterruptedException t) {
	}
	}
	
	public static void eieruhr(int time, String ausgabe) {
		EieruhrThread eieruhrThread = new EieruhrThread(time, ausgabe);
		eieruhrThread.start();
		
		System.out.println("einmal hier");
	}

}
