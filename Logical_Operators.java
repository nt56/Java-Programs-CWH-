package MyPackage;
import java.util.Scanner;

public class Logical_Operators {
	public static void main(String[] args) {
		
		/* System.out.println("for Logical AND: ");
		boolean a = true;
		boolean b = false;
			if (a && b) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			} */
			
			/* System.out.println("for Logical OR: ");
			boolean a = true;
			boolean b = false;
				if (a || b) {
					System.out.println("Y");
				}
				else {
					System.out.println("N");
				} */
		
		/* System.out.println("For Logical Not: ");
		boolean a = true;
		boolean b = false;
		System.out.println("Not (a) is: ");
		System.out.println(!a);
		System.out.println("Not (b) is: ");
		System.out.println(!b); */
		
			//multiple if conditions
		
		/* try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter Your age: ");
			int age = sc.nextInt();
			
			if(age > 56) {
				System.out.println("You are experienced...!");
			}
			else if(age > 46) {
				System.out.println("You are semi-experienced...!");
			}
			else if(age > 36) {
				System.out.println("You are semi-semi-experienced...!");
			}
			else {
				System.out.println("You are not experienced...!");
			}
		} */
		
				//Switch-case statement
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter Your age: ");
			int age = sc.nextInt();

	switch(age) {
		case 18:
			System.out.println("You are become an adult");
			break;
		case 25:
			System.out.println("You are become an mature");
			break;
		case 35:
			System.out.println("You are become an men");
			break;
		case 45:
			System.out.println("You are become an experienced men");
			break;
		default:
			System.out.println("Enjoy Your Life");
		}
	}
	}
}
