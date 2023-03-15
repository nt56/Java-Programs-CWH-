package nagu;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int[] marks = new int[3];
		marks[0] = 30;
		marks[1] = 56;
		marks[2] = 6;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the array index: ");
			int ind = sc.nextInt();
			
			System.out.println("Enter the number you want to divide the value with: ");
			int number = sc.nextInt();
			
			try {
				System.out.println("The value at array index entered is: " +marks[ind]);
				System.out.println("The value of array index value divide by number is: " +marks[ind]/number);
			}
			
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception occured..." +e);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception occured..." +e);
			}
			
			catch(Exception e) {
				System.out.println("some other exception is occured..." +e);
			}
		}
		
	}

}
