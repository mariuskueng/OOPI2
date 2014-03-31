import java.util.Observable;


public class Station extends Observable{
	private static final double MAX_VALUE = 0.8;

	public Station() {
		
	}
	
	public int nextMeasurement() {
		int random = (int)(Math.random());
		if (random > MAX_VALUE) {
			setChanged();
		}
		notifyObservers();
		return random;
	}

}
