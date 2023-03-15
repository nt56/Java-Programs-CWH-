package MyPackage;

class Phone{
	
	public void greet() {
		System.out.println("Good Morning");
	}
	
	public void name() {
		System.out.println("My name is Vivo");
	}
}

class SmartPhone extends Phone{
	
	public void welcome() {
		System.out.println("Your welcome....");
	}
	
	public void name() {
		System.out.println("My name is Samsung");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		Phone obj = new SmartPhone();	//Allowed (Superclass reference = Subclass Object)
		obj.greet();
		obj.name();		//runs the object method not reference method 
		
		//obj.welcome();---->Not Allowed
		
		//SmartPhone obj1 = new Phone(); ----> NotAllowed (Subclass reference = Superclass Object)
		
	}

}
