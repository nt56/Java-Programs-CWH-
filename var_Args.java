package MyPackage;

public class var_Args {
	
	static int sum(int ...arr) {	//It create iteself as array
		//Available as int[] arr
		int result = 0;
		for (int a: arr) {
			result = result + a;
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("Varargs Demontration........");
		System.out.println("Sum of these 2 numbers is :" +sum(4,5));
		System.out.println("Sum of these 3 numbers is :" +sum(4,5,6));
		System.out.println("Sum of these 4 numbers is :" +sum(4,5,6,7));
		System.out.println("Sum of these 5 numbers is :" +sum(4,5,6,7,8));
		
	}

}
 // If you one argument compulsory then you define method as:
		//	static int sum(int x,int ...arr){}