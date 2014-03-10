package sportler;

public class Rennfahrer implements Sportler {
	
	int speedTime = 0;
	
	public Rennfahrer() {
		this.speedTime = 0;
	}
	
	public Rennfahrer(int speedTime) {
		this.speedTime = speedTime;
	}
	
	@Override
	public int getMessung() {
		return speedTime;
	}

	@Override
	public boolean isBetter(Sportler s) {
		if (this.getMessung() > s.getMessung()) {
			return true;
		}
		return false;
	}

}
