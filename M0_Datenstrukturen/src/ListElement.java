
public class ListElement {
	private ListElement next; 
	private int value;
	
	public ListElement(int value, ListElement next) {
		this.value = value;
		this.next = next;
	}
	public int getValue() {
		return this.value;
	}
	public ListElement getNext() {
		return this.next;
	}
	public void setNext(ListElement next){
		this.next = next;
	}
	public boolean equals(Object o) {
		if (this == ((ListElement) o)) {
			return true;
		}
		return false;
	}
}
