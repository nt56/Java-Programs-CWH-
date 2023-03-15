package nagu;

import java.util.ArrayList;

public class ArrayListDemonstration {

	public static void main(String[] args) {
			
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(15);
		l2.add(16);
		l2.add(17);
		
		l1.add(5);
		l1.add(15);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(16);
		
		l1.add(0, 20);
		l1.add(2, 25);
		l1.add(4, 30);
		
		l1.addAll(l2);
		
		System.out.println("L2 Array List: " +l2);
		System.out.println("L1 Array List: " +l1);
		
		System.out.println(l1.contains(5));
		System.out.println(l1.contains(70));
		
		System.out.println(l1.indexOf(7));
		System.out.println(l1.indexOf(9));
	
		System.out.println(l1.lastIndexOf(15));
		System.out.println(l1.lastIndexOf(16));
		
		l1.set(2, 222);
		l1.set(5, 555);
		for(int i = 0; i<l1.size(); i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}
		
	}

}
