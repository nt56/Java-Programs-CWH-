package MyPackage;

//Question-1
/*class Circle1{
	public int radius;
	
	Circle1(int r){
		this.radius = r;
	}
	
	public double area() {
		System.out.print("Area of circle is: ");
		return Math.PI*radius*radius;
	}
}

class Cylinder1 extends Circle1{
	public int height;
	
	Cylinder1(int r,int h){
		super(r);
		this.height =h;
	}
	
	public double volume() {
		System.out.print("Volume of circle is: ");
		return Math.PI*radius*radius*height; 
	}
	
}*/

class Rectangle2{
	public int length , breadth;
	
//	Rectangle2(int l,int b){
//		this.length = l;
//		this.breadth = b;
//	}
	
	public void setArea(int l,int b){
		this.length = l;
		this.breadth = b;
	}
		
	public int getArea() {
		System.out.print("Area of Rectangle: ");
		return this.length*this.breadth;
	}
}

class Quboid extends Rectangle2{
	public int height;
	
//	Quboid(int l,int b,int h){
//		super(l,b);
//		this.height = h;
//	}
	
	public void setVolume(int l,int b,int h){
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	
	public int getVolume() {
		System.out.print("Volume of Rectangle: ");
		return this.length*this.breadth*this.height;
	}
}

public class Chap11_PracticeSet {

	public static void main(String[] args) {
		
//		Cylinder1 c1 = new Cylinder1(10,20);
//		System.out.println(c1.area());
//		System.out.println(c1.volume());
		
		Quboid q = new Quboid();
		q.setArea(10, 20);
		System.out.println(q.getArea());
		q.setVolume(10, 20, 30);
		System.out.println(q.getVolume());
		
	}

}
