package Aufgabe_01;

public class EieruhrThread extends Thread{

	private int time;
	private String ausgabe;
	private int timeSinceStart;
	
	public EieruhrThread(int time, String ausgabe) {
		this.time = time;
		this.ausgabe = ausgabe;
		this.timeSinceStart= 0; 
	}
	
	public void run() {
		while(this.timeSinceStart < this.time) {
			Eieruhr.schlafen(1);
			this.timeSinceStart++;
			System.out.println(this.ausgabe + " | Verbleibende Zeit " + (this.time - this.timeSinceStart));
		}
		System.out.println("Ring ring ring");
	}
}
