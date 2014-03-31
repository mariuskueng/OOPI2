import java.util.Observable;
import java.util.Observer;


public class ControlCenter implements Observer{

	public ControlCenter() {
		
	}
	
	public void update(Observable o, Object arg) {
		System.out.println("Der Messwert wurde überschritten");
	}

}
