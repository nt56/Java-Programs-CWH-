package MyPackage;

public class ArraysTopic {

	public static void main(String[] args) {
		//Declaring array in three ways in java
		//Way-1 (Declaration then memory allocation)
		
		/*int [] marks;
		marks = new int[5];
		
		marks[0] = 90;
		marks[1] = 80;
		marks[2] = 70;
		marks[3] = 60;
		marks[4] = 50;
		
		//marks[5] = 90; ---> It throws error
		
		System.out.println(marks[2]);*/
		
		//Way-2 (Declaration and memory allocation)
		
			/*	int [] marks = new int[5];
			
				marks[0] = 90;
				marks[1] = 80;
				marks[2] = 70;
				marks[3] = 60;
				marks[4] = 50;
				
				System.out.println(marks[2]);  */

				//Way-3 (Declaration , memory allocation and initialization)
				
			/*int [] marks = {80,90,85,98,52,99};
			System.out.println("Elements in arrays are: ");
			for (int i=0; i<marks.length; i++) {
				System.out.println(marks.length);  ----> It returns length of the array
				System.out.println(marks[i]);
			} */
		//The above examples are integer arrays examples you can create other data type arrays also.(float,char,string)
		
		//Quick quiz (display array elements in reverse order)
		
		/*int [] marks = {80,90,85,98,52,99};
		System.out.println("array Elements in reverse order are: ");
		for (int i=marks.length-1; i>=0; i--) {
			System.out.println(marks[i]);
		} */
		
		//For each loop
		
		/*int [] marks = {80,90,85,98,52,99};
		System.out.println("Elements in arrays are using for each loop: ");
		for(int element: marks) {
			System.out.println(element);
		}*/
		
		//Multi-diamentional arrays (2D)
		
		int [][] flats = new int [2][3];
		flats [0][0] = 101;  	//for first row and three columns
		flats [0][1] = 102;
		flats [0][2] = 103;
		
		flats [1][0] = 201;		//for second row and three columns
		flats [1][1] = 202;
		flats [1][2] = 203;
		
		System.out.println("Displaying 2D array using for loop: ");
		for (int i=0; i<flats.length; i++) {
			for (int j=0; j<flats[i].length; j++) {	// it goes inside the array of another array lenght
				System.out.print(flats [i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
			
	}
}
