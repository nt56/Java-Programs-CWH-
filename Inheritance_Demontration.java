package MyPackage;

class Base{		//Base class
	public int x;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x1) {
		System.out.println("I am Base Class and setting X");
		this.x = x1;
	}
	
	public void printMe() {
		System.out.println("It's me...");
	}
}

class Derived extends Base{		//deriving class from base class
	public int y;
	
	public int getY() {
		return y;
	}
	
	public void setY(int y1) {
		System.out.println("I am Derived Class and setting Y");
		this.y = y1;
	}
}

public class Inheritance_Demontration {

	public static void main(String[] args) {
		
		Derived d = new Derived();
		
		//calling base class method using derived class object
		d.setX(10);
		System.out.println(d.getX());
		
		//calling Derived class method using derived class object
		d.setY(20);
		System.out.println(d.getY());
	}

}
