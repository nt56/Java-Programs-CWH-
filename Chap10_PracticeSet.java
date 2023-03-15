package MyPackage;
//import java.util.*;

//Question-1
/*class Cylinder {
	private int radius;
	private int height;
	
	public void setRadius(int r) {
		this.radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
}*/

//Question-2
/*class Cylinder {
	private int radius;
	private int height;
	
	public void setRadius(int r) {
		this.radius = r;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getSurfaceArea() {
		return  2 * Math.PI*radius*height + 2*Math.PI*radius*radius ;
	}
	
	public double getVolume() {
		return  Math.PI*radius*radius*height ;
	}
	
}*/

//Question-3
/*class Cylinder {
	private int radius;
	private int height;
	
	public Cylinder(int r,int h) {
		this.radius = r;
		this.height = h;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getSurfaceArea() {
		return  2 * Math.PI*radius*height + 2*Math.PI*radius*radius ;
	}
	
	public double getVolume() {
		return  Math.PI*radius*radius*height ;
	}
	
}*/

//Question-4
class Rectangle1{
	public int lenght;
	public int breadth;
	
	public Rectangle1() {
		this.lenght = 4;
		this.breadth = 5;
	}
	
	public Rectangle1(int l,int b) {
		this.lenght = l;
		this.breadth = b;
	}
	
	public int getLength() {
		return lenght;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	
}

public class Chap10_PracticeSet {

	public static void main(String[] args) {
		
//		Cylinder c = new Cylinder();
//		c.setRadius(5);
//		System.out.println("Radius: " +c.getRadius());
//		c.setHeight(10);
//		System.out.println("Height: " +c.getHeight());
		
//		Cylinder c = new Cylinder();
//		c.setRadius(9);
//		System.out.println("Radius: " +c.getRadius());
//		c.setHeight(12);
//		System.out.println("Height: " +c.getHeight());
//		System.out.println("Surface area of cylinder is: " +c.getSurfaceArea());
//		System.out.println("Volume of cylinder is: " +c.getVolume());
		
//		Cylinder c = new Cylinder(9,12);
//		System.out.println("Radius: " +c.getRadius());
//		System.out.println("Height: " +c.getHeight());
//		System.out.println("Surface area of cylinder is: " +c.getSurfaceArea());
//		System.out.println("Volume of cylinder is: " +c.getVolume());
		
		Rectangle1 r1 = new Rectangle1();
		Rectangle1 r2 = new Rectangle1(10,20);
		System.out.println("Length of R1: " +r1.getLength());
		System.out.println("Breadth of R1: " +r1.getBreadth());
		System.out.println("Length of R2: " +r2.getLength());
		System.out.println("Length of R2: " +r2.getBreadth());
	}

}
