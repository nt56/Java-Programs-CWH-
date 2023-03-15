package MyPackage;

class Employee {
	int id;
	int salary;
	String name;
	
	public void printDetails() {
		System.out.println("ID of employee: " +id);
		System.out.println("Name of Empolyee: " +name);
	}
	
	public int getSalary() {
		return salary;
	}
}

public class OOP_Demonstration {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
		
		//creating the employee object
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		//setting attributes
		emp.id = 1;
		emp.salary = 20000;
		emp.name = "Nagu";
		
		//calling the employee class method
		emp.printDetails();
				
		emp1.id = 2;
		emp1.salary = 40000;
		emp1.name = "Sagu";
		
		emp1.printDetails();
		
		int give_Salary = emp1.getSalary();
		System.out.println("salary: " +give_Salary);

	}

}
