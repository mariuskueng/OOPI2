package myvector;

public class List<T extends Comparable<T>> {

	public static void main(String[] args) {
		List<Integer> l= new List();
		l.pushBack(2);
		l.pushBack(4);
		l.pushBack(10);
		l.print();
		System.out.println("Size "+l.size());
		System.out.println("Element 0 "+l.getElement(0));
		Object o= l.popFront();
		System.out.println("Element Front "+o);
		System.out.println("Element 0 "+l.getElement(0));
		System.out.println("Size "+l.size());
		System.out.println("Element Front "+l.popFront());
		System.out.println("Element 0 "+l.getElement(0));
		System.out.println("Size "+l.size());
		System.out.println("Element Front "+l.popFront());
		System.out.println("Element 0 "+l.getElement(0));
		System.out.println("Size "+l.size());
	}
	
	private ListElement head, tail;

	public List() { // Konstruktor. 
		head=null;
		tail=null;
	}
	
	public T getElement(int index){ // Element abfragen
		if (head==null){
			return null;
		} else {
			ListElement temp= head;
			int x= 0;
			while(temp != null && x<index){
				temp= temp.getNext();
				x++;
			}
			if (temp != null){
				return (T) temp.getValue();
			} else {
				return null;
			}
		}
	}
	
	public void print(){ // Element abfragen
		if (head!=null){
			ListElement temp= head;
			int x= 0;
			while(temp != null){
				System.out.println("Postition: "+x+" - Wert: "+temp.getValue());
				temp= temp.getNext();
				x++;
			}
		}
	}
	
	public int size(){// Anzahl der benutzen Plätze
		if (head==null){
			return 0;
		} else {
			ListElement temp= head;
			int x= 0;
			while(temp != null){
				temp= temp.getNext();
				x++;
			}
			return x;
		}
	}
	
	public void pushBack(T p){ // neues Element am Ende hinzufügen
		ListElement temp= new ListElement(p);
		if (head==null){
			head= temp;
			tail= temp;
		} else {
			tail.setNext(temp);
			tail= temp;
		}
	}
	public T popFront(){ // erstes Element abfragen und entfernen
		T result=null;
		if (head!=null){
			result= (T) head.getValue();
			if (head.getNext()!=null){
				head= head.getNext();
			} else {
				head= null;
				tail= null;
			}
		}
		return result;
	}

}
