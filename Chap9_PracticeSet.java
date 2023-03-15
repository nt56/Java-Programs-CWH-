package MyPackage;

	//Question-1(error)
/*class Employee {
	
	int salary;
	String name;
	
	public void setName(String n) {
		name = n;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
}*/

	//Question - 2
/*class cellPhone {
	
	public void ringing() {
		System.out.println("cellphone ringing");
	}
	
	public void vibrating() {
		System.out.println("cellphone virating");
	}
	
	public void calling() {
		System.out.println("calling the friend");
	}
}*/

	//Question -3 
/*class Square {
	
	int side;
	
	public int area() {
		return side * side;
	}
	
	public int perimeter() {
		return 4 * side;
	}
}*/

	//Question - 4
/*class Rectangle {
	int lenght;
	int breadth;
	
	public int area() {
		return lenght * breadth;
	}
	
	public int perimeter() {
		return 2 * (lenght + breadth);
	}
	
	public void setValue(int l,int b) {
		lenght = l;
		breadth = b;
	}
}*/

	//Question - 6
/*class Circle {
	int radious;
	
	public float area() {
		return 3.14f * radious * radious;
	}
	
	public float perimeter() {
		return 2 * 3.14f * radious ;
	}
	
	public void setValue(int r) {
		radious = r;
	}
}*/

	//Question - 5
class Tommy {
	 
	public void fire() {
		System.out.println("Firing on Enemy");
	}
	
	public void run() {
		System.out.println("running from Enemy");
	}
	
	public void hit() {
		System.out.println("Hitting the Enemy");
	}
}

public class Chap9_PracticeSet {

	public static void main(String[] args) {
		
		/*Employee emp = new Employee();
		emp.setName("NAGU");
		emp.salary = 100;
		System.out.println("Salary is:" +emp.getSalary());
		System.out.println("Name is:" +emp.getName());*/
		
		/*cellPhone cp = new cellPhone();
		cp.ringing();
		cp.vibrating();
		cp.calling();*/
		
		/*Square s = new Square();
		s.side = 3;
		System.out.println("Area of square is: " +s.area());
		System.out.println("Perimeter of square is: " +s.perimeter());*/
		
		/*Rectangle r = new Rectangle();
		r.setValue(5, 3);
		System.out.println("Area of Rectanle is: " +r.area());
		System.out.println("Perimeter of Rectanle is: " +r.perimeter());*/
		
		/*Circle c = new Circle();
		c.setValue(4);
		System.out.println("Area of circle is: " +c.area());
		System.out.println("Perimeter of circle is: " +c.perimeter());*/
		
		Tommy t = new Tommy();
		t.fire();
		t.run();
		t.hit();
		
	}

}
