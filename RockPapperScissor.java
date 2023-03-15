package MyPackage;
import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {
	
	public static void main (String[] args) {
		
		
		    try (Scanner sc = new Scanner (System.in)) {
				System.out.print("Enter 0(Rock) or 1(Paper) or 2(Scissor): ");
				int user = sc.nextInt();
				
				Random random = new Random();
				int system = random.nextInt();
				
				if (user == system) {
					System.out.println("Draw");
				}
				else if (user == 0 && system == 2 || user == 1 && system == 0 || user == 2 && system == 1 ) {
					System.out.println("You win...!");
				}
				else {
					System.out.println("You lose...!");
				}
				
				System.out.print("System Choice: ");
				System.out.print(system);
			}
		
	}
	

}
