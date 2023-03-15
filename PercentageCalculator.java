package MyPackage;
import java.util.*;

public class PercentageCalculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Subject1 Marks:");
			int a = sc.nextInt();
			System.out.println("Enter Subject2 Marks:");
			int b = sc.nextInt();
			System.out.println("Enter Subject3 Marks:");
			int c = sc.nextInt();
			System.out.println("Enter Subject4 Marks:");
			int d = sc.nextInt();
			System.out.println("Enter Subject5 Marks:");
			int e = sc.nextInt();
			
			float total = ((a+b+c+d+e)/500.0f)*100;
			System.out.println("The Percentage of student is: ");
			System.out.println(total);
		}

	}

}
