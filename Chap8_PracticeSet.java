package MyPackage;

public class Chap8_PracticeSet {
	
			//Question-1
	/*static void table(int n) {
		for (int i=1; i<=10; i++) {
			System.out.format("%d X %d = %d\n",n,i,n*i);
		}
	}*/
			//Question-2
	/*static void pattern(int n) {
		for (int i=0; i<n; i++) {
			for (int j=i; j<i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
		}*/
	
	 		//Question-3
	/*static int sumRec(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n + sumRec(n-1); ------> sum(5)= 5+sum(4)....so on 
		}
	}*/
			//Question-4
	/*static void pattern1(int n) {
		for (int i=0; i<n; i++) {
			for (int j=4; j>i; j--) {
					System.out.print("*");
				}
			System.out.println();
			}
		}*/
	
			//Question-5
	/*static int fib(int n) {
		if (n==1 || n==2) {
			return n-1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}*/
	
			//Question-6
	/*static int average_Sum(float ...arr) {
		float result = 0;
		for (float a: arr) {
			result = result + a;
		}
		float avg = result/arr.length;
		return (int) avg;
	}*/

			//Question-7 
	/*static void pattern_Recr(int n) {
		if (n > 0) {
			for (int i=n; i>0; i--) {
				System.out.print("*");
			}
		System.out.println();
		pattern_Recr(n-1);
		}
	}*/
	
			//Question-8
	/*static void pattern1_Recr(int n) {
		if (n > 0) {
			pattern1_Recr(n-1);
			for (int i=0; i<n; i++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}*/
	// pattern1_Recr(3)
	// pattern1_Recr(2) + 3 times star and new line
	// pattern1_Recr(1) + 2 times star and new line + 3 times star and new line
	// pattern1_Recr(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
	
			//Question-9
	/*static float celToFar(int c) {
		return (c * 1.8f) + 32.0f;
	}*/
	
			//Question-10
	
	static int sumOfNatural(int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			 sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
//		table(5);
		
//		pattern(4);
		
//		int c = sumRec(5);
//		System.out.println(c);
		
//		pattern1(4);
		
//		int result = fib(7);
//		System.out.println(result);
		
//		float x = average_Sum(1,2,3,4,5,6);
//		System.out.print("Average of argument you passed is:" +x);
		
//		int r = pattern_Recr(4);;
//		System.out.println(r);
		
//		pattern1_Recr(4);
		
//		pattern_Recr(4);
		
//		float result = celToFar(70);
//		System.out.println("Given value in celsius is: " +result);

		int num = 10;
		System.out.println("Tha sum of first " +num+ " th natural number is: " +sumOfNatural(num));

	}

}
