package Aufgabe_1_Threads;

public class Threads {

	public static void main(String[] args) {
	     Geschenk g= new Geschenk();
	     ParentThread p= new ParentThread(g);
	     ChildThread c= new ChildThread(g);
	     Thread parent= new Thread(p);
	     parent.start();
	     c.start();
	}

}
