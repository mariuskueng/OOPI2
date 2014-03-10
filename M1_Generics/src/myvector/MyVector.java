package myvector;

public class MyVector<T extends Comparable<T>> {
	private int size;
	private Comparable[] contents;

	public MyVector() {
		size = 0;
		contents = new Comparable[16];
	}

	public MyVector(int capacity) {
		size = 0;
		contents = new Comparable[capacity];
	}

	public Object getElement(int index) {
		if (index >= 0 & index < size)
			return contents[index];
		else {
//			 throw new Exception("Index nicht möglich");
			return null;
		}
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return contents.length;
	}

	public void pushBack(Comparable element) {
		if (size >= contents.length) {
			Comparable[] temp = contents;
			contents = new Comparable[temp.length * 2];
			for (int i = 0; i < temp.length; ++i) {
				contents[i] = temp[i];
			}
		}
		contents[size++] = element;
	}

	public Object popFront() {
		if (size == 0)
			return null;
		else {
			Object temp = contents[0];
			for (int i = 1; i < size; ++i) {
				contents[i - 1] = contents[i];
			}
			size--;
			return temp;
		}
	}

	public static void main(String[] args) {
		MyVector mv= new MyVector(2);
		mv.pushBack(new Integer(8));
		mv.pushBack(new Integer(7));
		mv.pushBack(new Integer(2));
		mv.pushBack(new Integer(10));
		System.out.println("Im Vektor sind "+mv.getSize()+ " von "+mv.getCapacity()
				+" Plaetzen belegt");
		System.out.println(mv.getElement(3));
		System.out.println(mv.popFront());
		System.out.println("Im Vektor sind "+mv.getSize()+ " von "+mv.getCapacity()
				+" Plaetzen belegt");
	}
}
