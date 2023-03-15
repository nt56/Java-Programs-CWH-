package MyPackage;
//import java.util.*;

public class Chap6_PracticeSet {

	public static void main(String[] args) {
		
			// Question-1
		
		/*float [] marks = {22.5f,33.6f,99.9f,100.0f,50.5f};
		float sum = 0;
		for (float element:marks) {
			sum = sum + element;
		}
		System.out.print("Value of sum is: ");
		System.out.println(sum); */
		
			// Question-2
		
		/*int [] marks = {85,90,99,100,50};
		int num = 99;
		boolean isInArray = false;
		for (int element:marks) {
			if(num == element) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The number present in the array");
		}
		else {
			System.out.println("The number not present in the array");
		} */
		
			//Question - 3
		
		//int [] marks = {85,90,99,100,50};
		
	/*	int [] marks = new int[5];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Mark-1: ");
			marks[0] = sc.nextInt();
			System.out.print("Mark-2: ");
			marks[1] = sc.nextInt();
			System.out.print("Mark-3: ");
			marks[2] = sc.nextInt();
			System.out.print("Mark-4: ");
			marks[3] = sc.nextInt();
			System.out.print("Mark-5: ");
			marks[4] = sc.nextInt();
		}
		int sum = 0;
		for (int element:marks) {
			sum = sum + element;
		}
		System.out.print("Averege of marks is: ");
		System.out.println(sum/marks.length); */
		
			//Question - 4
		
	/*	int [][] mat1 = {{1,2,3},{4,5,6}};
		int [][] mat2 = {{2,3,4},{5,6,7}};
		int [][] mat3 = {{0,0,0},{0,0,0}};
		
		for (int i=0; i<mat1.length; i++) {	//row number of times
			for (int j=0; j<mat1[i].length; j++) {	//column number of times
				//System.out.format("i=%d and j=%d\n",i,j);
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		for (int i=0; i<mat1.length; i++) {	//row number of times
			for (int j=0; j<mat1[i].length; j++) {	//column number of times
				System.out.print(mat3[i][j]+ " ");
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println("");
		}	*/
		
			//Question - 5
		
		/*int [] marks = {85,90,99,100,50};
		for (int i=marks.length-1; i>=0; i--) {
			System.out.println(marks[i]);
		}	*/
		
			//Question -5 
		
		/*	int [] arr = {1,2,3,4,5,6};
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		
		for(int i=0; i<n; i++) {
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
 		}
		for(int element:arr) {
			System.out.println(element);
		
	}	*/
		
			//Question - 6 (minimum)
		
		/*	int [] arr = {1,2,3,4,5,6};
		int min = Integer.MIN_VALUE;
		for(int element:arr) {
			if (element > min ) {
				min = element;
			}
		}
		System.out.print("The maximum element in an array is: ");
		System.out.println(min);	*/
		
	//Question - 7 (maximum)
		
		/*	int [] arr = {1,2,3,4,5,6};
		int max = Integer.MAX_VALUE;
		for(int element:arr) {
			if (element < max ) {
				max = element;
			}
		}
		System.out.print("The minimum element in an array is: ");
		System.out.println(max);	*/
	
	
		//Question -8 
	
	int[] arr = {1,234,54,4,5};
	boolean isSorted = true;
	for(int i=0; i<arr.length-1; i++) {
		if(arr[i] > arr[i+1]) {
			isSorted = false;
			break;
		}
	}
	if(isSorted) {
		System.out.println("Array is sorted");
	}
	else {
		System.out.println("Array is not sorted"); 
	}

}
}