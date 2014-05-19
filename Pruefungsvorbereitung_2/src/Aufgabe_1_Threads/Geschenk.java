package Aufgabe_1_Threads;

public class Geschenk {
	private String text="";
	
	public synchronized String getText() {
		return text;
	}
	public synchronized void setText(String text) { 
		this.text = text;
	}
}
