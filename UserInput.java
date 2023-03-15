package MyPackage;
import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		System.out.println("Taking Input From The User");
		try (Scanner sc = new Scanner(System.in)) {
			/*System.out.println("Enter Number 1: ");
			int a = sc.nextInt();
			System.out.println("Enter Number 2: ");
			int b = sc.nextInt();*/
			
			/*System.out.println("Enter Number 1: ");
			Float a = sc.nextFloat();
			System.out.println("Enter Number 2: ");
			Float b = sc.nextFloat();
			Float sum = a + b;*/
			
			/*System.out.println("Sum is: ");
			System.out.println(sum);*/
			
			boolean b1 = sc.hasNextInt();
			System.out.println(b1);
		}
	}

}
