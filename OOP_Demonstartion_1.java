package MyPackage;

class Emp {
	public int id;
	public String name;
	public int salary;
	
	public int getSalary() {
		return salary;
	}
	
	public void getDetails() {
		System.out.println("........Details of Employee........");
		System.out.println("ID Of Employee Is: " +id);
		System.out.println("Name Of Employee Is: " +name);
		System.out.println("salary Of Employee Is: " +getSalary());
	}
	
}

public class OOP_Demonstartion_1 {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		
		emp.id = 1;
		emp.name = "Nagbhushan";
		emp.salary = 50000;
		
		emp.getDetails();

	}

}
