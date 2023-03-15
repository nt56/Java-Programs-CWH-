package MyPackage;
import java.util.*;

public class Chap4_Practice_Set {

	public static void main(String[] args) {
		
			//Question-1 --> Throws the error because of assignment operator
		
				
		
	  /*	try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter Subject-1 Marks:");
			int sub1 = sc.nextInt();
			System.out.print("Enter Subject-2 Marks:");
			int sub2 = sc.nextInt();
			System.out.print("Enter Subject-3 Marks:");
			int sub3 = sc.nextInt();
			
			float per = ((sub1+sub2+sub3)/300.0f)*100.0f;
			System.out.println(per);
			
			if (per <= 40 ) {
				System.out.println("Your Failed...!");
			}
			if(per >= 40 || per <= 60) {
				System.out.println("You Passed Only...!");
			}
			if(per >= 60 || per <= 80) {
				System.out.println("You Passed In First Class...!");
			}
			if(per >= 80) {
				System.out.println("You Passed In Distinction...!");
			} 
			else{
				System.out.println("Something went Wrong");
			}
				
		} */
					
					//Question-2
		
		/*try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter Subject-1 Marks:");
			int sub1 = sc.nextInt();
			System.out.print("Enter Subject-2 Marks:");
			int sub2 = sc.nextInt();
			System.out.print("Enter Subject-3 Marks:");
			int sub3 = sc.nextInt();
			
			float per = ((sub1+sub2+sub3)/300.0f)*100.0f;
			System.out.print("Your Percentage is: ");
			System.out.println(per);
			
			if (per >= 40 && sub1 > 33 && sub2 > 33 && sub2 > 33) {
				System.out.println("You are Passed...!");
			}
			else {
				System.out.println("You are Failed....!");
			}
	} */
		
				//Question-3
		
		/* try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter Your Annual Income In Lakhs: ");
			float tax = 0;
			float income = sc.nextFloat();
			
			if(income<=2.5f) {
				tax = tax + 0;
			}
			else if(income>=2.5f && income<=5f) {
				tax = tax + 0.05f * (income-2.5f);
			}
			else if(income>=5f && income<=10.0f) {
				tax = tax + 0.05f * (5.0f - 2.5f);
				tax = tax + 0.2f * (income - 5f);
			}
			else if(income>10.0f) {
				tax = tax + 0.05f * (5.0f - 2.5f);
				tax = tax + 0.2f * (10.0f - 5f);
				tax = tax + 0.3f * (income - 5f);
			}
			
			System.out.print("Total tax that ypu have to pay is: ");
			System.out.println(tax);
		}*/
		
				//Question-4
		
	/*	try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter day between 1 - 7: ");
			int day = sc.nextInt();
			
//			switch(day) {
//			case 1 -> System.out.println("Monday");
//			case 2 -> System.out.println("Tuseday");
//			case 3 -> System.out.println("Wednesday");
//			case 4 -> System.out.println("Thursday");
//			case 5 -> System.out.println("Friday");
//			case 6 -> System.out.println("Saturday");
//			case 7 -> System.out.println("Sunday");
//			}
			
			switch(day) {
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuseday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("HI...!");
			}
			
		} */
	
				//Question-5
		
		/* try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter Year: ");
			int year = sc.nextInt();
			
			if (year%4==0) {
				System.out.println("the "+year+" is leap year");
			}
			else {
				System.out.println("the "+year+" is not leap year");
			}
		} */
		
				//Question-6
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter Website Url: ");
			String website = sc.next();
			
			if (website.endsWith(".org")) {
				System.out.println("This is the organizational website");
			}
			else if (website.endsWith(".com")) {
				System.out.println("This is the Commercial website");
			}
			else if (website.endsWith(".in")) {
				System.out.println("This is the indian website");
			}
		}
		
	}
}
