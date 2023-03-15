package MyPackage;
//import java.util.*;

public class Chap3_Strings {

	public static void main(String[] args) {

		//String name = new String("Nagbhushan Tirth");
		//String name = "Nagbhushan";
		//System.out.print("Name is : ");
		//System.out.println(name);
		
		/* int a = 6;
		float b = 6.567f;
		System.out.printf("The value of a is %d and The value of b is %.2f\n",a,b);
		System.out.format("The value of a is %d and The value of b is %f",a,b);
		//both are same printf and format */
		
		/*try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter string:");
			String str = sc.nextLine(); 
			System.out.println(str);
			//only next it returns one word and if nextLine then it returns whole sentence
		}*/
		
				//String Methods
		
		
		String str = "NagbhuShan";
		System.out.print("String is: ");
		System.out.println(str);
		
		int value = str.length();
		System.out.print("Length of String is: ");
		System.out.println(value); //returns length of string
		
		String lstring = str.toLowerCase();
		System.out.print("String in lower case is: ");
		System.out.println(lstring); //returns string in lower case
		
		String ustring = str.toUpperCase();
		System.out.print("String in upper case is: ");
		System.out.println(ustring); //returns string in upper case
		
		String str1 = "    Nagbhushan    ";
		System.out.print("After trimming: ");
		System.out.println(str1.trim()); //it removes all the spaces before and after of string
		
		String sub_string = str.substring(3); //returns the character that index starts with 3 to string end
		System.out.print("After substring: ");
		System.out.println(sub_string);
		
		String sub_string_both = str.substring(3,7); //returns string start with index 3 and end with index 7
		System.out.print("After substring to both side: ");
		System.out.println(sub_string_both);
		
		String replacing = str.replace('N', 'A'); //it replaces character N by A / you can replace more than one character also
		System.out.print("After replacing the string: ");
		System.out.println(replacing);
		
		boolean start_with = str.startsWith("Na"); //returns true if it start with given character
		System.out.print("Output: ");
		System.out.println(start_with);
		
		boolean end_with = str.endsWith("an"); //returns true if it ends with given character
		System.out.print("Output: ");
		System.out.println(end_with);
		
			//remaining method description in the notes 
		System.out.print("Output: ");
		System.out.println(str.charAt(5));
		
		String str2 = "Harryrryrry";
		System.out.print("Index of that character is: ");
		System.out.println(str2.indexOf("rry")); //returns the position of given string from start
		
		System.out.print("Index of that character start with index of: ");
		System.out.println(str2.indexOf("rry",4)); //if given character not found then it returns -1.
		
		System.out.print("Index of that character is from last: ");
		System.out.println(str2.lastIndexOf("rry")); //returns the position of given string from last
		
		System.out.print("Index of that character start with index of from last: ");
		System.out.println(str2.lastIndexOf("rry",7)); //it select the string upto 7th index and returns the position of given string from last.
		
		System.out.print("Output: ");
		System.out.println(str.equals("NagbhuShan")); //case sensitive
		
		System.out.print("Output: ");
		System.out.println(str.equalsIgnoreCase("Nagbhushan")); // not a case sensitive
		
				//Escape sequence character
		
		System.out.println(" \" My Name Is Nagbhushan \" "); //for double quote
		System.out.println(" \" My Name Is \t Nagbhushan \" "); //for tab space
	}

}
