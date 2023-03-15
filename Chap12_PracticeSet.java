package MyPackage;

		//Question-1 & 2
/*abstract class Pen{
	
	abstract void write();
	abstract void refill();
	
}

class FountanPen extends Pen{
	
	void write() {
		System.out.println("Writting");
	}
	
	void refill() {
		System.out.println("Inserting refill in pen");
	}
	
	void changeNib() {
		System.out.println("Changing nib");
	}
	
}*/

		//Question - 3
/*class Monkey{
	
	void jump() {
		System.out.println("Jumping");
	}
	
	void bite() {
		System.out.println("Biting");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class Human extends Monkey implements BasicAnimal{
	
	void speek() {
		System.out.println("speaking");
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Slepping");
	}
	
}*/

		//Question - 4
/*abstract class TelePhone{
	
	abstract void jump();
	abstract void lift();
	abstract void disconnect();
	
}

interface MobilePhone {
	void call();
	void off();
}

class SmartTelephone extends TelePhone implements MobilePhone{
	
	void jump() {
		System.out.println("Jumping...");
	}
	
	void lift() {
		System.out.println("Lifting");
	}
	
	void disconnect() {
		System.out.println("Disconnecting");
	}
	
	public void call() {
		System.out.println("Calling");
	}
	
	public void off() {
		System.out.println("mobile is off");
	}
	
}*/


interface TvRemote{
	void on();
	void off();
}

interface SmartTvRemote extends TvRemote{
	void meth3();
}

//Question - 6
//class Tv implements SmartTvRemote{
//	
//	public void meth1() {
//		System.out.println("Method 1");
//	}
//	
//	public void meth2() {
//		System.out.println("Method 2");
//	}
//	
//	public void meth3() {
//		System.out.println("Method 3");
//	}
//} 

//Question - 7
class Tv implements TvRemote{
	public void on() {
		System.out.println("on TV ");
	}
	
	public void off() {
		System.out.println("off TV");
	}
}

public class Chap12_PracticeSet {

	public static void main(String[] args) {
		
//		FountanPen fn = new FountanPen();
//		fn.changeNib();
//		fn.write();
//		fn.refill();
		
//		Human h = new Human();	----> without polymorphism
//		h.jump();
//		h.bite();
//		h.eat();
//		h.sleep();
		
		//Question-5
//		Monkey m = new Human();	----> Using polymorphism
//		m.bite();
//		m.jump();
		
//		MobilePhone mp = new SmartTelephone();
//		mp.call();
//		mp.off();
		
		Tv t = new Tv();
		t.on();
		t.off();
		
	}

}
