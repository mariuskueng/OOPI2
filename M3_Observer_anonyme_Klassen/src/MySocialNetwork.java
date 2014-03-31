
public class MySocialNetwork {

	public MySocialNetwork() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Networker peter= new Networker("Peter"); 
		Networker andrea= new Networker("Andrea"); 
		Networker paul= new Networker("Paul"); 
		Networker maike= new Networker("Maike"); 
		
		peter.addObserver(paul); paul.addObserver(peter); 
		andrea.addObserver(maike); maike.addObserver(andrea);
		peter.addObserver(maike);
		maike.addObserver(peter);
		paul.postMessage("Hello everybody");
		peter.postMessage("I have a girlfriend");
		maike.postMessage("I have a boyfriend");
		
		peter.deleteObserver(maike);  //Peter ist nicht mehr mit Maike befreundet
		maike.deleteObserver(peter);  //Maike ist nicht mehr mit Peter befreundet
		maike.postMessage("I am single");
		peter.postMessage("I am single");
	}

}
