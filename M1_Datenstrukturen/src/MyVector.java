
public class MyVector {
	
	private int[] values;
	
	public static void main(String[] args) {
		System.out.println("MyVector");
//		MyVector elements = new MyVector(10);
		int[] array = {1, 2, 3};//, 4, 5, 6, 0, 8, 9, 10};
		MyVector elements = new MyVector(array);
		
		System.out.println(elements.capacity());
//		elements.pushBack(99);
		System.out.println(elements.capacity());
		System.out.println();
		elements.setElement(5, 123);
		elements.popFront();
		
		for (int i = 0; i < elements.capacity(); i++) {
			System.out.println(i+1 + ": " + elements.getElement(i + 1));
		}
		
		System.out.println("\nListElement");
		
		ListElement MyListElement1 = new ListElement(10, null);
		ListElement MyListElement2 = new ListElement(20, null);
		
		List list = new List(MyListElement1, MyListElement2);
		System.out.println(list.getHead().getValue());
		System.out.println(list.getTail().getValue());
		System.out.println(list.getSize());
		list.append(MyListElement2);
	}
	
	
	public MyVector(int capacity) {
		this.values = new int[capacity];
	}
	
	public MyVector(int[] array) {
		this.values = array;
	}
	
	public Object getElement(int index) {
		try {
			return this.values[index - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void setElement(int index, int value) {
		try {
			this.values[index] = value;
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	
	public int size() {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] != 0) {
				count++;
			}
		}
		return count;
	}
	
	public int capacity() {
		return this.values.length;
	}
	
	public void pushBack(int newValue) {
		
		if (this.size() == this.capacity()) {
			int[] newValues = new int[this.capacity() + 1];
	
			for (int i = 0; i < values.length; i++) {
				newValues[i] = values[i]; 
			}
	
			newValues[this.capacity()] = newValue;
			this.values = newValues;
		} else {
			for (int i = 0; i < this.capacity(); i++) {
				if (this.values[i] == 0) {
					this.values[i] = newValue;
					break;
				}
			}
		}
	}
	
	public int popFront() {
		int oldValue = this.values[0];
		this.values[0] = 0;

		for (int i = 0; i < this.capacity()-1; i++) {
			this.values[i] = this.values[i+1];			
		}
		
		this.values[this.capacity()-1] = 0;
		return oldValue;
	}

}
