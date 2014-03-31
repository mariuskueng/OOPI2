import java.util.Observable;
import java.util.Observer;


public class Networker extends Observable implements Observer {
	private String name;
	private String message;

	public Networker(String n) {
		this.name = n;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Networker) {
			Networker myFriend = (Networker)o;
			String wort= "single";
			String text= myFriend.message;
			  
			System.out.println("Dear "+ myFriend.name +" I have seen that you posted:" + myFriend.message);
//			if (text.contains(wort) {
//				System.out.println("I am sorry");
//			}
		}
	}
	
	public void postMessage(String m) {
		this.message = m;
		this.setChanged();
		this.notifyObservers();
	}

}
