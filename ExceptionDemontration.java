package nagu;

import java.util.Scanner;

public class ExceptionDemontration {

	public static void main(String[] args) {
		
//		Syntax error demo
//		int a ----->  because semicolon(;) is missing
		
		
		// Logical error demo
//		System.out.println(2);
//		for (int i=1; i<5; i++) {
//			System.out.println(2*i+1);
		
		//In above condition the logical error is it prints 9 as a prime number but in real 9 is not prime number.
//		}
		
		
		//Runtime error demo
		int k;
		try (Scanner sc = new Scanner(System.in)) {
			k = sc.nextInt();
		}
		System.out.println("Integer part of 1000 devided by k is: " +1000/k);
		//In above condition the runtime error is arithmetic exception (divide by zero)
	}

}
