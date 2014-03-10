import java.util.*;

public class Uebung_1 {
	public static void main(String[] args) {
		ArrayList<Integer> liste= new ArrayList<Integer>();
		Stack<Integer> stack= new Stack<Integer>();
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			liste.add(i);
			stack.add(i);
			queue.add(i);
		} 
		
		System.out.println("U3");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
			liste.remove(0); // remove the first one because the list reorders itself
			i=0; // reset index otherwise the index reaches the list size at some point
		}
		System.out.println("U4.1");
		for (Integer i : stack) {
			System.out.println(i);
		}
		
		for (Integer i : queue) {
			System.out.println(i);
		}
		System.out.println("U4.2");
		for (int i = 0; i < 10; i++) {
			System.out.println(stack.pop()); // returns and removes the last element of the stack
			System.out.println(queue.poll()); // returns and removes the first element of the queue
		}

	}
}
