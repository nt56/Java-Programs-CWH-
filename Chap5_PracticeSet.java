package MyPackage;

public class Chap5_PracticeSet {

	public static void main(String[] args) {
		
			//Question-1
		
		/* int n = 4;
		for (int i=n; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		} */
		
		/*int n = 5;
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		} */
		
			//Question-2
		
		//2*i ----> even numbers
		//2*i+1 ----> odd numbers
		
		int sum = 0;
		int n = 5;
		for (int i=0; i<n; i++) {
			sum = sum + (2*i);
		}
		System.out.print("Sum of even numbers is: ");
		System.out.println(sum);
	}
		
			//Question-3
		
		/*int n = 5;
		for (int i=1; i<=10; i++) {
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}*/
		
			//Question-4
		
		/*int n = 10;
		for (int i=10; i>=1; i--) {
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}*/
		
			//Question-5(while)
		
		/*int n = 5;
		int factorial = 1;
		int i = 1;
		while(i<=n) {
			factorial = factorial * i;
			i++;
		}
		System.out.print("Factorial of Given Number is: ");
		System.out.println(factorial);
	}*/
		
		//Question-6(for)
		
		/*int n = 5;
		int factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.print("Factorial of given number is : ");
		System.out.println(factorial); */
		
		// Question-7 
		
		/*int i = 4;   //column
		while(i>0) {
			int j = 0; //row
			while (j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		} */
		
			//Question-8 ---> true
		
			//Question-9
		
		/*int n = 8;
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum = sum + n*i;
		}
		System.out.println(sum);
	}*/
	
			//Question-10 ---> at least once
		
			//Question-11
		
	/*	int sum = 0;
		int n = 5;
		int i=0;
		while (i<n) {
			sum = sum + (2*i);
			i++;
		}
		System.out.println(sum);	
	}	*/
		
}
