package MyPackage;

public class Loops {
	public static void main (String[] args) {
		
			//while loop
		
		 /* int i = 100;
		while(i <= 200) {
			System.out.println(i);
			i++;
		} */
		
			//do-while loop 
		
		/*  int i = 1;
		do{
			System.out.println(i);
			i++;
		}
		while(i <= 100); */
		
			//for loop
		
		/*System.out.println("Odd numbers between 1-100 are: ");
		for(int i=0; i<=100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		} */
		
		/*int n = 10;   //10 odd numbers will generate
		for (int i=1; i<n; i++) {
			System.out.println(2*i+1);
	} */
		
		//decrement in for loop
		/* System.out.println("Natural numbers in reverse orders are: ");
		for(int i=100; i!=0; i--) {
				System.out.println(i);
		} */
		
			//Break keyword
		
		/*for (int i=0; i<20; i++) {
			if (i == 10) {
				break;
			}
			System.out.println(i);
		} */
		
			//Continue Keyword
		
		for (int i=0; i<20; i++) {
			if (i == 10) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
