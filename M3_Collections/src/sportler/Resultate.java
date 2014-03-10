package sportler;

import java.util.ArrayList;

public class Resultate <T extends Sportler>{
	
	ArrayList<T> al= new ArrayList<T>();
	
	public void add(T element) {
		al.add(element);
	}
	
	public double getAverage() {
		double sum = 0;
		for(T i: this.al) {
			sum += i.getMessung();
		}
		return sum/this.al.size();
	}
	
	public T getWinner() {
		T current = this.al.get(0);
		for(T i: this.al) {
			if(!current.isBetter(i)) {
				current = i;
			}
		}
		return current;
	}
	
	public static void main(String[] args) {
		Resultate<Rennfahrer> sr1 = new Resultate<Rennfahrer>();
		sr1.add(new Rennfahrer(100));
		
		Resultate<Sportler> sr2= new Resultate<Sportler>(); 
		sr2.add(new Sportler()); // Interface
		
		Resultate<Sportler> sr3= new Resultate<Eiskunstlaeufer>();
		sr3.add(new Eiskunstlaeufer());
		
		Resultate<Rennfahrer> sr4= new Resultate<Rennfahrer>();
		sr4.add(new Rennfahrer());
		
		Object o= sr4.getWinner();
		Resultate<Sportler> sr5= new Resultate<Sportler>();
		sr5.add(new Rennfahrer());
		
		Rennfahrer r= sr5.getWinner();
		Resultate<?> sr6= new Resultate<Rennfahrer>();
		sr5.add(new Rennfahrer());
		
		Rennfahrer rf= sr5.getWinner();
		Resultate<? extends Rennfahrer> sr7= new Resultate<Rennfahrer>();
		sr7.add(new Rennfahrer());
		
		Rennfahrer rf7= sr7.getWinner();
		Resultate<? super Rennfahrer> sr8= new Resultate<Rennfahrer>();
		
		sr8.add(new Rennfahrer());
		Rennfahrer rf8= sr8.getWinner();

	}
	
}
