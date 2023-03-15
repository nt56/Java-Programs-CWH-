package MyPackage;

class A{
	public void method1() {
		System.out.println("I am a class A method");
	}
}

class B extends A{
	public void method1() {
		System.out.println("I am a class B method");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		B b = new B();
		b.method1();  	//In method overriding by default child class method run over the parent class method (Latest method execites)
		
	}

}
