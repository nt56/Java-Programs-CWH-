package nagu;

//Using Runnable Interface

class MyThread3 implements Runnable{
	
	public void run() {
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");
		System.out.println("I am a Thread");

	}
	
}

class MyThread4 implements Runnable{
	
	public void run() {
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");
		System.out.println("I am a Thread also");

	}
	
}


public class MultithreadingDemo1 {

	public static void main(String[] args) {
		
		MyThread3 mt3 = new MyThread3();
		Thread t1 = new Thread(mt3);
		
		MyThread4 mt4 = new MyThread4();
		Thread t2 = new Thread(mt4);
		
		t1.start();
		t2.start();
		
	}

}
