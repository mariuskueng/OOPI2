import java.util.ArrayList;


public class Network {

	public Network() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ControlCenter controllCenter = new ControlCenter();
		
		ArrayList<Station> stationen = new ArrayList<Station>();
		Station station1 = new Station();
		station1.addObserver(controllCenter);
		for (int i = 0; i < 20; i++) {
			station1.nextMeasurement();
		}
		
		stationen.add(station1);
		
	}

}
