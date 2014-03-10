
public class List {
	private ListElement head;
	private ListElement tail;
	
	public void main(String[] args) {
		System.out.println("asdf");
	}
	
	public List(ListElement head, ListElement tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	
	public ListElement getHead() {
		return head;
	}
	public void setHead(ListElement head) {
		this.head = head;
	}
	public ListElement getTail() {
		return tail;
	}
	public void setTail(ListElement tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		ListElement current = tail;
		int size = 0;
		
		while (current != null) {
			current = current.getNext();
			size++;
		}
		
		return size;
		
	}
	
	public void append(ListElement toAppend) {
		head.setNext(toAppend);
		head = toAppend;
	}

}
