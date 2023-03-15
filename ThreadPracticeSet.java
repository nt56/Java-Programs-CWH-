package nagu;

class Thr1 extends Thread{
	
	public void run() {
		System.out.println("Good Morning");
	}
}

class Thr2 extends Thread{
	
	public void run() {
		int i = 0;
		while (i < 20) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome");
		i++;
	}
	}
}


public class ThreadPracticeSet {

	public static void main(String[] args) {
		
		Thr1 t1 = new Thr1();
		Thr2 t2 = new Thr2();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		
		t1.start();
		
		System.out.println(t1.getState());//state of t1 thread after starting
		System.out.println(Thread.currentThread().getState());//printing the state of current thread using it's reference.
		
		t2.start();
		
		
	}

}
