package myvector;

public class ListElement<T extends Comparable<T>>{
	private T value;
	private ListElement next;
	
	public ListElement(T value){
		this.value= value;
		next=null;
	}
	
	public void setNext(ListElement element){ 	
		next= element;
	}
	
	public ListElement getNext(){
		return next;
	}
	
	public void setValue(T value){
		this.value= value;
	}
	
	public Object getValue(){
		return value;
	}

	public boolean equals(Object o){
		return value.equals(o);
	}
}