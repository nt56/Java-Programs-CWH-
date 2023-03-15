package MyPackage;

class Employee1 {
	
	private int id;
	private String name;
	
	//parameterise constructor defination
	public Employee1(String n,int i) {
		this.id = i;
		this.name = n;
	}
	
	//Default constructor defination
	//Constructor Overloading
	/*public Employee1() {
		this.id = 2;
		this.name = "NT";
	}
	
	public Employee1(String n) {
		this.id = 2;
		this.name = n;
	}
	
	public Employee1(int i) {
		this.id = i;
		this.name = "SAGU";
	}*/
	
	public void display() {
		System.out.println("ID: " +id);
		System.out.println("NAME: " +name);
	}	
}

public class ConstructorsDemontration {

	public static void main(String[] args) {
		
		Employee1 mp = new Employee1("ST",4); 	//parameterised 
		mp.display();
		
		//Constructor overloading
		/*Employee1 mp = new Employee1();	
		Employee1 mp1 = new Employee1("NAGESH");
		Employee1 mp2 = new Employee1(5);
		mp.display();		
		mp1.display();
		mp2.display();*/
	}
}
