package nagu;

public class FinallyBlock {
	
	public static int greet() {
		
		try {
			int a = 50;
			int b = 10;
			int c = a/b;
			return c;
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally{
			System.out.println("this is finally block always executes");
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a = greet();
		System.out.println(a);
		
		int a1 = 7;
		int b1 = 9;
		
		while(true) {
			try {
				System.out.println(a1/b1);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I am finally for value of b = " +b1);
			}
			b1--;
		}
		
	}

}
