
public class Person implements Comparable<Person>{
	
	private int alter;
	private String name;
	private int matrikelnummer;
	
	
	
	public Person(int alter, String name, int matrikelnummer) {
		super();
		this.alter = alter;
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}



	public int getAlter() {
		return alter;
	}



	public void setAlter(int alter) {
		this.alter = alter;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMatrikelnummer() {
		return matrikelnummer;
	}



	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	
	@Override
	public String toString() {
		return this.getName() + "(" + this.getAlter() + ") hat die Nummer " + this.getMatrikelnummer();
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this.getAlter() == ((Person) obj).getAlter()) {
			return true;
		}
		return false;
	}


	@Override
	public int compareTo(Person p) {
		if (this.getAlter() > p.getAlter()) {
			return 1;
		}
		else if (this.getAlter() < p.getAlter()) {
			return -1;
		}
		else {
			return 0;
		}
	}


	@Override
	public int hashCode() {
		return this.getAlter();
	}

}
