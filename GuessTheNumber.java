package MyPackage;
import java.util.*;

//Throwing some error

class Game{
	
	public int system_Number;
	public int user_Number;
	public int total_Guess = 0;
	
	public int getTotalGuess() {
		return total_Guess;
	}
	
	public void setTotalGuess(int guess) {
		this.system_Number = guess;
	}
	
	Game(){
		Random rand = new Random();
		this.system_Number = rand.nextInt(100);
	}
	
	void takeUserInput() {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Guess the number: ");
			this.user_Number = sc.nextInt();
		}
		}	
	
	boolean isCorrectNumber() {
		total_Guess++;
		if (user_Number == system_Number) {
			System.out.format("Yes you guessd it right, it was %d\nYou guessed it in %d attempts...", system_Number,total_Guess);
			return true;
		}
		else if (user_Number < system_Number) {
			System.out.println("To Low...");
		}
		else if (user_Number > system_Number){
			System.out.println("To High...");
		}
		return false;
	}
}

public class GuessTheNumber {

	public static void main(String[] args) {
			
		Game g = new Game();
		boolean b = false;
		
		while(!b) {
			g.takeUserInput();
			b = g.isCorrectNumber();
			System.out.println(b);
		}
		
	}

}
