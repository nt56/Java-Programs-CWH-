package MyPackage;

abstract class Parent{
	Parent(){
		System.out.println("I am a parent class constructor");
	}
	
	abstract public void greet();
	abstract public void greet2();
}

class Child extends Parent{
	
	public void greet() {
		System.out.println("Good Morning");
	}

	public void greet2() {
		System.out.println("Good Night");		
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.greet();
		c.greet2();
		
		//Parent p = new Parent()------>error
		
	}

}

//You can create one abstract class from another abstract class  
//You can't create object of abstract class
//It creates the standard which methods are implement to next class and so on(we only defines method what methods wants to use)
//In abstract class minimum one abstract method is there and other common methods are there
//You have to necessary to implement all abstract method in subclasses