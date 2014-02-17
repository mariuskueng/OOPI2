
public class MyVector {
	
	public static void main(String[] args) {
		
//		MyVector elements = new MyVector(10);
		int[] array = {1, 2, 3};//, 4, 5, 6, 0, 8, 9, 10};
		MyVector elements = new MyVector(array);
		
		System.out.println(elements.capacity());
//		elements.pushBack(99);
		System.out.println(elements.capacity());
		System.out.println();
		
		elements.popFront();
		
		for (int i = 0; i < elements.capacity(); i++) {
			System.out.println(i+1 + ": " + elements.getElement(i + 1));
		}
	}
	
	private int[] values;
	
	
	public MyVector(int capacity) {
		this.values = new int[capacity];
	}
	
	public MyVector(int[] array) {
		this.values = array;
	}
	
	public Object getElement(int index) {
		if (index > this.capacity()) {
			return null;
		}
		else {
			return this.values[index - 1];
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
