package MyPackage;

class MyEmployee {
	
	private int id;
	private String name;
	
	//using getter and setter method
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
}

//Implementing the private access modifires using the methods as shown in example
//without using the methods you can not acces the private variables and methods from one class to another class
public class AccessModifiers {

	public static void main(String[] args) {
		 
		MyEmployee me = new MyEmployee();
		me.setName("NAGU");
		System.out.println("Name: " +me.getName());
		me.setId(1);
		System.out.println("ID: " +me.getId());

	}

}
