package nagu;

class MyThr extends Thread{
	
	MyThr(String name){
		super(name);
	}
	
	public void run() {
			System.out.println("I am Thread");
	}
	
}

public class ThreadConstructor {

	public static void main(String[] args) {
		
		MyThr mt = new MyThr("Nagu");
		MyThr mt1 = new MyThr("Sagu");
		mt.start();
		mt1.start();
		
		System.out.println("Id of thread is: " +mt.getId());
		System.out.println("Name of Thread is: " +mt.getName());
		
		System.out.println("Id of thread is: " +mt1.getId());
		System.out.println("Name of Thread is: " +mt1.getName());
		
	}

}
//You can create multiple threads as you can