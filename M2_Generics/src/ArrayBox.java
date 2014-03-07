
public class ArrayBox <T extends A>{
	private A[] myArray = new A[5];
	
	public void add(T val) {
		myArray[0] = val;
	}
}
