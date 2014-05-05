package threads;

public class MyThread extends Thread{
	private int number = 0;
	static int counter = 0;
	
	public MyThread(int n) {
		this.number = n;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + number + " " + getCounter());
			try {
		       sleep((int)(Math.random()*5));
		     } catch (InterruptedException e) {
		       e.printStackTrace();
		     }
			System.out.println("Thread " + number + " fertig");
		}
	}
	
	public static synchronized int getCounter() {
		return ++counter;
	}
	
	public static void main(String[] args) {
		MyThread t1= new MyThread(1);
		MyThread t2= new MyThread(2);
		MyThread t3= new MyThread(3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
