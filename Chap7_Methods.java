package MyPackage;

//-------->static method (If ypu want a call method without using the object then you you create static meyhod for that.
public class Chap7_Methods {
	static int MySum(int a,int b) {
		 int c;
		 if(a>b) {
			 c = a+b;
		 }
		 else {
			 c = (a+b) * 5;
		 }
		 return c;
	 }	
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z;
		z = MySum(x,y);
		
		int x1 = 20;
		int y1 = 10;
		int z1 = MySum(x1,y1);
		
		System.out.println(z);
		System.out.println(z1);
	}
}



//------->object method // If ypu want a call method using the object then you you do not create static meyhod for that.
/* public class Chap7_Methods {
	int MySum(int a,int b) {
		int c;
		if(a>b) {
		 c = a+b;
		}
		else {
		 c = (a+b) * 5;
		}
	 return c;
 }

public static void main(String[] args) {
	int z;
	Chap7_Methods obj = new Chap7_Methods();
	z = obj.MySum(10,20);
	System.out.println(z);
}
}	*/
