package MyPackage;

class Base2{
	
	public Base2() {
		System.out.println("I am base class constructor");
	}
	
	public Base2(int x) {
		System.out.println("I am base class constructor which initailize X:" +x);
	}
	
}

class Derived2 extends Base2{
	
	public Derived2() {
		System.out.println("I am Derived class constructor");
	}
	
	public Derived2(int x,int y) {
		super(x);	//calling Base2 class constructor using super keyword
		System.out.println("I am Derived2 class constructor which initailize Y:" +y);
	}
	
}

class Derived2Chiled extends Derived2{
	
	public Derived2Chiled() {
		System.out.println("I am Derived2 child class constructor");
	}
	
	public Derived2Chiled(int x,int y,int z) {
		super(x,y);		//calling Derived2 class constructor using super keyword
		System.out.println("I am Derived2 child class constructor which initailize Z:" +z);
	}
	
}


public class ConstructorInheritance {

	public static void main(String[] args) {
		
//		Derived2 d = new Derived2(10,20);
//		System.out.println(d);
		
//		Derived2Chiled d1 = new Derived2Chiled(10,20,30);	//If you overload the constructor then it depends upon the arguments you passed
//		System.out.println(d1);								//Using super keyword we can access the other class constructor 
		
		Derived2Chiled d2 = new Derived2Chiled();	//---->It executes first parent class constructor then child class then grand child class constructor
		System.out.println(d2);						//If you not pass any argument 

		
	}

}
