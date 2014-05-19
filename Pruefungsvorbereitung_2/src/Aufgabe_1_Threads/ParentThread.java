package Aufgabe_1_Threads;

public class ParentThread implements Runnable{

	private Geschenk g;
	  
	public ParentThread(Geschenk g) {
		this.g = g;
	}
	@Override
	public void run() {
		
	   for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(3560);
				System.out.println("Geschenk zum " + (i+1) + "ten Geburtstag");
				g.setText("Geschenk zum " + (i+1) + "ten Geburtstag");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	   }
	}

}
