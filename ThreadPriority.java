package nagu;

class MyThr1 extends Thread{
	
	MyThr1(String name){
		super(name);
	}
	
	public void run() {
		
		int i = 0;
		while(i < 20000) {
		System.out.println("Thank You...." +this.getName());
		
	}
	}
}


public class ThreadPriority {

	public static void main(String[] args) {
		
		MyThr1 mt1 = new MyThr1("Nagu1");
		MyThr1 mt2 = new MyThr1("Nagu2");
		MyThr1 mt3 = new MyThr1("Nagu3");
		MyThr1 mt4 = new MyThr1("Nagu4");
		MyThr1 mt5 = new MyThr1("Nagu5");
		
		mt5.setPriority(Thread.MAX_PRIORITY);
		mt4.setPriority(Thread.MIN_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		mt1.setPriority(Thread.MIN_PRIORITY);
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
		
	}

}
