package Aufgabe_1_Threads;

public class ChildThread extends Thread{

	private Geschenk g;
	private int counter;
	
	public ChildThread(Geschenk g) {
		counter = 0;
		this.g = g;
	}
	@Override
	public void run() {
		try {
			while (counter < 20) {
				Thread.sleep((long) (Math.random()*300));
				if (!g.getText().isEmpty()) {
					g.setText("");
					System.out.println("Juhu, ich habe mein Geschenk zum "+counter+"ten Geburtstag bekommen.");
					counter++;
				} else {
					System.out.println("Ouhh!");
				}
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
