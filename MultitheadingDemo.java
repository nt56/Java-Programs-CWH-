package nagu;

//using thread class
class MyThread1 extends Thread{
	
	public void run() {
		int i = 0;
		while(i < 40000) {
			System.out.println("Thread-1 is runnig");
			System.out.println("I am good");
			i++;
		}
	}
	
}

class MyThread2 extends Thread{
	
	public void run() {
		int i = 0;
		while(i < 40000) {
			System.out.println("Thread-2 is runnig");
			System.out.println("I am sad");
			i++;
		}
	}
	
}

public class MultitheadingDemo {

	public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		
		mt1.start();
		mt2.start();
		
	}

}
