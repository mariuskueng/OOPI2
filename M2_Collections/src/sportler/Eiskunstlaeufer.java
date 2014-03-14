package sportler;

public class Eiskunstlaeufer implements Sportler {
	
	int speedTime = 0;
	
	public Eiskunstlaeufer() {
		this.speedTime = 0;
	}
	
	public Eiskunstlaeufer(int s) {
		this.speedTime = s;
	}

	@Override
	public int getMessung() {
		return this.speedTime;
	}

	@Override
	public boolean isBetter(Sportler s) {
		if (this.getMessung() > s.getMessung()) {
			return true;
		}
		return false;
	}

}
